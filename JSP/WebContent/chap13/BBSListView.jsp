<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ page import="java.util.*"%>
<%@ page import="org.apache.log4j.*"%>
<%@ page import="chap13.BBSList" %>

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
	<h3>게시판 목록보기</h3>
	<table border="1">
		<tr>
			<td width="40">순번</td>
			<td width="300">제목</td>
			<td width="80">작성자</td>
			<td width="90">작성일자</td>
			<td width="70">작성시각</td>
		</tr>
		<c:forEach var="cnt" begin="0" end="${BBS_LIST.listSize - 1}">
		<tr>
		    <%
		    	//Date date = new Date();
		    	//logger.info("시간: " + date);
		    	BBSList bbsList = (BBSList)request.getAttribute("BBS_LIST");
		    	logger.info(bbsList.getSeqNo());
		    %>
			<td>${BBS_LIST.seqNo[cnt]}</td>
			<td><a href='chap13/WebTemplate.jsp?BODY_PATH=BBSItemView.jsp?SEQ_NO=${BBS_LIST.seqNo[cnt]}'>${BBS_LIST.title[cnt]} </a></td>
			<td>${BBS_LIST.writer[cnt]}</td>
			<td>${BBS_LIST.date[cnt]}</td>
			<td>${BBS_LIST.time[cnt]}</td>
		</tr>
		</c:forEach>
	</table>
	
	<c:if test="${!BBS_LIST.lastPage}">
		<a href='bbs-list?LAST_SEQ_NO=${BBS_LIST.seqNo[BBS_LIST.listSize-1]}'>다음 페이지</a>
	</c:if>
	
</body>
</html>