<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.sql.ResultSet"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>

<%@ page import="java.sql.*"%>    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	
<%
	request.setCharacterEncoding("UTF-8");
	String name     = request.getParameter("name");
	String id       = request.getParameter("id");
	String password = request.getParameter("password");
	
	if(name==null || id == null || password == null)
		throw new Exception("데이터를 입력하세요.");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	// Statement stmt  = null;
	String url = "jdbc:mysql://localhost:3306/webdb";
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, "root", "123456789");
		
		if(conn == null)
			throw new Exception("데이터베이스에 연결할 수 없습니다.");
		
		//String sql ="INSERT INTO userinfo(uname, uid, upassword) VALUES ('" + name + "'," + "'" + id + "'," + "'" + password + "')";
		String sql = "INSERT INTO userinfo(uname, uid, upassword) VALUES ( ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, id);
		pstmt.setString(3, password);
	  		
		int rowNum = pstmt.executeUpdate();
		
		if(rowNum < 1)
			throw new Exception("데이터를 DB에 입력할 수 없습니다.");
	}finally{
		try{
			pstmt.close();
		}catch(Exception e){ e.getMessage();}
			
		try{
			conn.close();
		}catch(Exception e){ e.getMessage();}
	}
	
	response.sendRedirect("SubscriptionResult.jsp");
				
%>
	
				
</body>
</html>