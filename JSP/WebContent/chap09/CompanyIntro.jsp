<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   

<fmt:setBundle basename="Intro" />
   
<html>
<head>

<title>windows7K</title>
</head>
<body>
	<h3><fmt:message key="TITLE" /></h3>
	    <fmt:message key="GREETING" /> <br/><br/>
	    <fmt:message key="BODY" /> <br/><br/>
	    <font size=2><fmt:message key="COMPANY_NAME" /></font>
</body>
</html>