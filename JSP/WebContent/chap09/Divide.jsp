<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<%
	String str1 = (request.getParameter("NUM1")==null)? "0" : request.getParameter("NUM1");
	String str2 = (request.getParameter("NUM2")==null)? "0" : request.getParameter("NUM2");
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	<c:catch var="e">
		<% int result = num1 / num2; %>
		나눗셈의  결과는? <%= result %>
	</c:catch>
	<c:if test="${e != null}" >
		에러 메시지: ${e.message} <br/>
	</c:if>
	
	<c:import url="Echo.jsp"></c:import>
	<c:import url="https://news.naver.com/main/list.nhn?mode=LPOD&mid=sec&oid=015&listType=paper&date=20180730"></c:import>
	
	
	
	
	
</body>
</html>