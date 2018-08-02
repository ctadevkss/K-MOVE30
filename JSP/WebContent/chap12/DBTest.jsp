<?xml version="1.0" encoding="UTF-8" ?>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>

	<h2>데이터 베이스 연결 테스트</h2>
	<%
		String url = "jdbc:mysql://localhost:3306/webdb";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, "root", "123456789");
	
		if(conn != null) {
			out.println("mysql 데이터 베이스로 연결 했습니다. <br/>");
			conn.close();
			out.println("mysql 데이터 베이스로 연결을 끊습니다. <br/>");
		}
		else {
			out.println("mysql 데이터베이스로 연결 할 수 없습니다.<br/>");
		}
	%>
</body>
</html>