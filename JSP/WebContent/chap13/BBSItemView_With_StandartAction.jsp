<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<%@ page import="chap13.BBSItem" %>

<%
	int seqNo = Integer.parseInt( (request.getParameter("SEQ_NO") == null) ? "1": request.getParameter("SEQ_NO"));
	BBSItem bbsItem = new BBSItem();
	bbsItem.setSeqNo(seqNo);
	bbsItem.readDB();
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	<h3>게시글 읽기</h3>
	[제목]      <%=bbsItem.getTitle()%> <br/>
    [작성자]    <%=bbsItem.getWriter()%> <br/>
    [작성일시]  <%=bbsItem.getDate()%> <%=bbsItem.getTime()%> <br/>
    <hr></hr>
    <%=bbsItem.getContent()%> <br/>



</body>
</html>