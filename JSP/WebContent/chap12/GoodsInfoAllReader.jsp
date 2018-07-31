<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.*"%>
<%@page import="chap12.Goodsinfo"%>

<%
    ArrayList<Goodsinfo> goodsInfoList = new ArrayList<Goodsinfo>();
	Goodsinfo goodsInfo;

	Connection conn = null;
	Statement stmt = null;

	try{
		String url = "jdbc:mysql://localhost:3306/webdb";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, "root", "123456789");
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from goodsinfo");
		// GoodsInfo테이블 컬럼명 -  gcode	title	writer	price
		
		while(rs.next()) {
		
			goodsInfo = new Goodsinfo();
			goodsInfo.setGcode(rs.getString("gcode"));
			goodsInfo.setTitle(rs.getString("title"));
			goodsInfo.setWriter(rs.getString("writer"));
			goodsInfo.setPrice(rs.getInt("price"));
		
			goodsInfoList.add(goodsInfo); // DB에서 조회된 데이터를 리스트에 저장
		}
	
		request.setAttribute("GoodsInfoList", goodsInfoList); // GoodsInfoList를 request영역에 저장
	
	}catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try{
			stmt.close();
		}catch(Exception e) {}
	
		try{
			conn.close();
		}catch(Exception e){}
	}
%>

<jsp:forward page = "GoodsInfoAllView.jsp" />

%>