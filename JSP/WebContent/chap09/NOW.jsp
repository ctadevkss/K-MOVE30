<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   
    
<c:set var="date" value="<%= new Date()%>" />    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	
	<h3>오늘의 날짜 <fmt:formatDate value="${date }" /></h3>
	<h3>오늘의 날짜 <fmt:formatDate value="${date }" type="date" dateStyle="long"/></h3>
	<h3>현재의 시각 <fmt:formatDate value="${date }" type="time"/></h3>
	<h3>현재의 시각 <fmt:formatDate value="${date }" type="time" timeStyle="full" /></h3>
	
	<h3>날짜와 시각 <fmt:formatDate value="${date }" type="both" dateStyle="long" timeStyle="short" /></h3>
    
</body>
</html>