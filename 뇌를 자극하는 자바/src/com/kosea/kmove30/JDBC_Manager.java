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
		System.out.println("query - " + query);
		stmt = conn.createStatement();           
		rs = stmt.executeQuery(query); // rs = stmt.executeQuery(select pname, age, gender from person);
		
		return rs;
	}
	
	// query - "INSERT INTO person (pname, age, gender) values('홍길동',41,'m')";
	public void insertTable(String[] arr) throws Exception{
		
		String name   = arr[0]; // 이름 
		String age    = arr[1]; // 나이
		String gender = arr[2]; // 성별 
		String query = "INSERT INTO person (pname, age, gender) values"
				+ "('" + name + "'," + age + ",'" + gender + "'" + ")";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int insertCount = stmt.executeUpdate(query);
		
		if (insertCount > 0)
		System.out.println(insertCount + "건이 삽입 되었습니다.");
	}
	
	// query - "update person set age = 42 where pname = '홍길동'";
	public void updateTable(String name, String age) throws Exception{
		String query = "update person set age = " + age + 
				" where pname = '" + name + "'";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int updateCount = stmt.executeUpdate(query);
		
		if (updateCount > 0)
			System.out.println(updateCount + "건이 수정 되었습니다.");
	}
	
	// query - "delete from person where pname = '홍길동' ";
	public void deleteTable(String deleteName) throws Exception{
		String query = "delete from person where pname = '" + deleteName + "'";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		
		if (deleteCount > 0)
		System.out.println(deleteCount + "건이 삭제 되었습니다.");
	}
	
	// DB 연결해제
	public void DBClose() throws Exception{
		conn.close();
	}
}
