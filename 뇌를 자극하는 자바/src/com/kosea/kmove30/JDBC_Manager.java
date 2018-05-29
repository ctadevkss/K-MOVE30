package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Manager {
	
	/////// 속성(필드) 
	Connection conn = null;  // DB 연결을 위한 커넥션 인터페이스 
	Statement stmt = null;   // Statement 인터페이스 - SQL 실행.
	ResultSet rs = null;     // ResultSet 인터페이스 - SQL 결과를 저장
	
	// 생성자
	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}
	
	public JDBC_Manager() {
		System.out.println("JDBC_Manager() 기본 생성자 호출");
	}
		
	//////// 기능(메소드)
	// DB 연결
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception{
		 
		//Class.forName("com.mysql.jdbc.Driver"); //JDBC드라이버를 로드
		Class.forName(driver); //JDBC드라이버를 로드
        conn = DriverManager.getConnection(url, user, pass);
        return conn;
	}
	
	// query - "select pname, age, gender from person"
	public ResultSet SelectTable(String query) throws Exception{
		stmt = conn.createStatement();           
		rs = stmt.executeQuery(query);
		return rs;
	}
	
	// DB 연결해제
	public void DBClose() throws Exception{
		conn.close();
	}
}
