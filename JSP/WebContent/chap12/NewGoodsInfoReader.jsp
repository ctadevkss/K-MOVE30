<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@page import="java.sql.*"%>

<%
	String gcode =request.getParameter("gcode");  // 파라미터로 gcode값 받는 곳
	Connection conn = null;
	Statement stmt = null;
	
	try{
					
		Class.forName("org.apache.commons.dbcp.PoolingDriver");
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:apache:commons:dbcp:/webdb_pool");
		
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