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
		stmt = conn.createStatement();           
		rs = stmt.executeQuery(query);
		return rs;
	}
	
	// DB ��������
	public void DBClose() throws Exception{
		conn.close();
	}
}
