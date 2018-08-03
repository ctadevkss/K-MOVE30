package chap13;

import org.apache.log4j.*;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BBSListServlet extends HttpServlet {

	Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String strUpperSeqNo = request.getParameter("LAST_SEQ_NO");
		int upperSeqNo;
		if(strUpperSeqNo==null)
			upperSeqNo = Integer.MAX_VALUE;
		else
			upperSeqNo = Integer.parseInt(strUpperSeqNo);
		
		BBSList list = readDB(upperSeqNo);
		
		request.setAttribute("BBS_LIST", list);
		//RequestDispatcher dispatcher = request.getRequestDispatcher("chap13/BBSListView.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher("chap13/WebTemplate.jsp?BODY_PATH=BBSListView.jsp");
		dispatcher.forward(request, response);
	}
	
	private BBSList readDB(int upperSeqNo) throws ServletException {
		
		BBSList list = new BBSList();
		Connection conn = null;
		Statement stmt = null;
		String query = null;
		try {
			Class.forName("org.apache.commons.dbcp.PoolingDriver");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wdbpool");
			
			if(conn==null)
				throw new Exception("데이터베이스에 연결 할 수 없습니다.");
			
			stmt = conn.createStatement();
			
			query = "select * from bbs where seqno < " + upperSeqNo + " order by seqno desc;";
			logger.info("query: " + query);
			
			ResultSet rs = stmt.executeQuery(query);			 
			
			for(int cnt=0; cnt<5; cnt++) {
				if(!rs.next()) 
					break;
				list.setSeqNo(cnt,  rs.getInt("seqno"));
				list.setTitle(cnt,  rs.getString("title"));
				list.setWriter(cnt, rs.getString("writer"));
				list.setDate(cnt,   rs.getDate("wdate"));
				list.setTime(cnt,   rs.getTime("wtime"));
			}
			
			if(!rs.next())
				list.setLastPage(true); // 페이지에 마지막 true 셋팅
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return list;
	}
	
}
