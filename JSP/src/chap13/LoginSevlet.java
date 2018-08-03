package chap13;

import org.apache.log4j.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class LoginSevlet extends HttpServlet {

	Logger logger = Logger.getLogger(this.getClass());
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String id = request.getParameter("ID");
		String password = request.getParameter("PASSWORD");
		String result;
		
		if(checkLoginInfo(id, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("LOGIN_ID", id);
			result = "SUCCESS";
		}
		else {
			result = "FAIL";
		}
		
		response.sendRedirect("chap13/WebTemplate.jsp?BODY_PATH=LoginResult.jsp?LOGIN_RESULT="+result );
	}
	
	private boolean checkLoginInfo(String id, String password) throws ServletException {
		Connection conn = null;
		Statement stmt = null;
		String query;
		boolean result = false;
		
		try {
			Class.forName("org.apache.commons.dbcp.PoolingDriver");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wdbpool");
			
			if(conn==null)
				throw new Exception("데이터베이스에 연결 할 수 없습니다.");
			
			stmt = conn.createStatement();
			
			query = "select upassword from userinfo where uid = '" + id + "'";
			logger.info("query: " + query);
			
			ResultSet rs = stmt.executeQuery(query);
			
			if(!rs.next())
				result = false;
			
			String correctPassword = rs.getString("upassword");
			
			if(password.equals(correctPassword))
				result = true;
			else
				result = false;			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			try {
				conn.close();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;
		}
	}
}
