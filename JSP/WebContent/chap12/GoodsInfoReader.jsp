<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%
	String gcode =request.getParameter("gcode");  // 파라미터로 gcode값 받는 곳
	Connection conn = null;
	Statement stmt = null;
	
	try{
		String url = "jdbc:mysql://localhost:3306/webdb";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, "root", "123456789");
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from goodsinfo where gcode = '" + gcode + "'" );
		
		if(rs.next()) {
			String title = rs.getString("title");
			String writer = rs.getString("writer");
			int price = rs.getInt("price");
			
			request.setAttribute("GCODE", gcode);
			request.setAttribute("TITLE", title);
			request.setAttribute("WRITER", writer);
			request.setAttribute("PRICE", price);
		}
		
		
		//if(conn == null)
			//throw new Exception("데이터 베이스에 연결 할 수 없습니다.");
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try{
			stmt.close();
		}catch(Exception e) {
			
		}
		
		try{
			conn.close();
		}
		catch(Exception e){
			
		}
	}
%>

<jsp:forward page = "GoodsInfoView.jsp" />


    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>

</body>
</html>