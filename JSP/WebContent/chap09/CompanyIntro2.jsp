<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>   

<fmt:setBundle basename="Intro" />
<fmt:message var="title" key="TITLE" />
<fmt:message var="greeting" key="GREETING" />
<fmt:message var="body" key="BODY" />
<fmt:message var="companyName" key="COMPANY_NAME" />
   
<html>
<head>

<title>windows7K</title>
</head>
<body>
	<h3></h3>
	     <br/>${title }<br/>
	     <br/>${greeting }<br/>
	     <br/>${body }<br/>
	    <font size=2>${companyName }</font>
</body>
</html>