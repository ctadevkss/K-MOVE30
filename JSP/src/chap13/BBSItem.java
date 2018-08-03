package chap13;

import java.sql.*;
import javax.servlet.ServletException;

public class BBSItem {

	private int seqNo;
	private String title;
	private String content;
	private String writer;
	private Date date;
	private Time time;
	
	public int getSeqNo() {
		return seqNo;
	}
	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	public void readDB() throws ServletException {
		
		Connection conn = null;
		Statement stmt = null;
	
		try {
			Class.forName("org.apache.commons.dbcp.PoolingDriver");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wdbpool");
			
			if(conn==null)
				throw new Exception("데이터베이스에 연결 할 수 없습니다.");
			
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from bbs where seqno ='" + seqNo + "'");
			
			if(rs.next()) {
				title = rs.getString("title");
				content = rs.getString("content");
				writer = rs.getString("writer");
				date = rs.getDate("wdate");
				time = rs.getTime("wtime");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
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
	}

}
