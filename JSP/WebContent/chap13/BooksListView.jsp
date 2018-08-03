<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ page import="java.util.*"%>
<%@ page import="org.apache.log4j.*"%>
<%@ page import="chap13.BooksList" %>

<%
	Logger logger = Logger.getLogger(this.getClass());
	logger.debug("++++++ 로그 출력 debug +++++"); 
	logger.info("++++++ 로그 출력 info +++++"); 
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	<h3>책 목록보기</h3>
	<table border="1">
		<tr>
			<td width="40">순번</td>
			<td width="80">코드</td>
			<td width="300">제목</td>
			<td width="90">저자</td>
			<td width="70">가격</td>
		</tr>
		<c:forEach var="cnt" begin="0" end="4" varStatus="status">
		<tr>
		    <%
		    	//Date date = new Date();
		    	//logger.info("시간: " + date);
		    	BooksList booksList = (BooksList)request.getAttribute("BOOKS_LIST");
		    	logger.info(booksList.getGcode());
		    %>
			<td>${status.count}</td>
			<td>${BOOKS_LIST.gcode}</td>
			<td>${BOOKS_LIST.title}</td>
			<td>${BOOKS_LIST.writer}</td>
			<td>${BOOKS_LIST.price}</td>
		</tr>
		</c:forEach>
	</table>	
</body>
</html>