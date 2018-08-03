<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:useBean id="bbsItem" class="chap13.BBSItem" />
<jsp:setProperty name="bbsItem" property="seqNo" value="${param.SEQ_NO}" />   

<%
	bbsItem.readDB();
%>

<h4>게시글 읽기</h4>
	
	[제목] ${bbsItem.title}    								 <br/>
	[작성자] ${bbsItem.writer} 								 <br/>
	[작성일시] ${bbsItem.date} ${bbsItem.time} 				 <br/>  
	-------------------------------------------------------- <br/>
    ${bbsItem.content}
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>

</body>
</html>