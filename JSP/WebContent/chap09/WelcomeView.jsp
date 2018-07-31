<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 

<fmt:bundle basename="Welcome" >
	<fmt:message var="greeting" key="GREETING">
		<fmt:param>${ID}</fmt:param>
	    <fmt:param>${VNUM}</fmt:param>
	</fmt:message>
	
	<fmt:message var="body" key="BODY"/>
	<fmt:message var="compayName" key="COMPANY_NAME"/>
</fmt:bundle>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	${greeting } <br/><br/>
	${body } <br/><br/>
	<font size=2>${companyNmae } </font>
</body>
</html>