<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="DBError.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@ page import="java.sql.*" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	<h3> 데이터베이스 커넥션 풀 테스트</h3>
	<%
		Class.forName("org.apache.commons.dbcp.PoolingDriver");
		Class.forName("com.mysql.jdbc.Driver");
		//Connection conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/webdb_pool");
		Connection conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/wdbpool");
		
		if(conn!=null) {
			out.print("연결취득완료 <br/>");
			conn.close();
			out.print("연결반환완료 <br/>");
		}
		else {
			out.print("연결취득실패 <br/>");
		}
	%>
	
</body>
</html>








