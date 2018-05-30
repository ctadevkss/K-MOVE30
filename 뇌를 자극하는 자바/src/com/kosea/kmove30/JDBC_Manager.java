package com.kosea.kmove30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_Manager {
	
	/////// �Ӽ�(�ʵ�) 
	Connection conn = null;  // DB ������ ���� Ŀ�ؼ� �������̽� 
	Statement stmt = null;   // Statement �������̽� - SQL ����.
	ResultSet rs = null;     // ResultSet �������̽� - SQL ����� ����
	
	// ������
	public JDBC_Manager(Connection conn, Statement stmt, ResultSet rs) {
		super();
		this.conn = conn;
		this.stmt = stmt;
		this.rs = rs;
	}
	
	public JDBC_Manager() {
		System.out.println("JDBC_Manager() �⺻ ������ ȣ��");
	}
		
	//////// ���(�޼ҵ�)
	// DB ����
	public Connection DBConnection(String driver, String url, String user, String pass) throws Exception{
		 
		//Class.forName("com.mysql.jdbc.Driver"); //JDBC����̹��� �ε�
		Class.forName(driver); //JDBC����̹��� �ε�
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
	
	// query - "INSERT INTO person (pname, age, gender) values('ȫ�浿',41,'m')";
	public void insertTable(String[] arr) throws Exception{
		
		String name   = arr[0]; // �̸� 
		String age    = arr[1]; // ����
		String gender = arr[2]; // ���� 
		String query = "INSERT INTO person (pname, age, gender) values"
				+ "('" + name + "'," + age + ",'" + gender + "'" + ")";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int insertCount = stmt.executeUpdate(query);
		
		if (insertCount > 0)
		System.out.println(insertCount + "���� ���� �Ǿ����ϴ�.");
	}
	
	// query - "update person set age = 42 where pname = 'ȫ�浿'";
	public void updateTable(String name, String age) throws Exception{
		String query = "update person set age = " + age + 
				" where pname = '" + name + "'";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int updateCount = stmt.executeUpdate(query);
		
		if (updateCount > 0)
			System.out.println(updateCount + "���� ���� �Ǿ����ϴ�.");
	}
	
	// query - "delete from person where pname = 'ȫ�浿' ";
	public void deleteTable(String deleteName) throws Exception{
		String query = "delete from person where pname = '" + deleteName + "'";
		System.out.println("query - " + query);
		stmt = conn.createStatement();
		int deleteCount = stmt.executeUpdate(query);
		
		if (deleteCount > 0)
		System.out.println(deleteCount + "���� ���� �Ǿ����ϴ�.");
	}
	
	// DB ��������
	public void DBClose() throws Exception{
		conn.close();
	}
}
