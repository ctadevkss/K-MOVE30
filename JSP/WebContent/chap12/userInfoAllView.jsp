<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.util.*"%>
<%@page import="chap12.UserInfo" %>

<%
    ArrayList<UserInfo> userInfoList = new ArrayList<UserInfo>();
	UserInfo usersInfo;

	Connection conn = null;
	Statement stmt = null;

	try{
		String url = "jdbc:mysql://localhost:3306/webdb";
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(url, "root", "123456789");
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("select * from userinfo");
		// GoodsInfo테이블 컬럼명 -  gcode	title	writer	price
		
		out.print("<h2> 전체 회원 보기</h2>");
		
		while(rs.next()) {
		
			usersInfo = new UserInfo();
			usersInfo.setUname(rs.getString("uname"));
			usersInfo.setUid(rs.getString("uid"));
			usersInfo.setUpassword(rs.getString("upassword"));
			
			out.println("이름:"     + usersInfo.getUname() + "<br/>");
			out.println("아이디:"   + usersInfo.getUid()   + "<br/>");
			out.println("패스워드:" + usersInfo.getUpassword() + "<br/><br/>");
			
			userInfoList.add(usersInfo); // DB에서 조회된 데이터를 리스트에 저장
		}
	
		request.setAttribute("GoodsInfoList", userInfoList); // GoodsInfoList를 request영역에 저장
	
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
