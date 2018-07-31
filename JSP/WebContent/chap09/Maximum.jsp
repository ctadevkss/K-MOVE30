<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>



<c:set var="num1" value="100" />
<c:set var="num2" value="50" />

<c:if test="${num1 > num2}">
		큰수: ${num1}
</c:if>


최대값:
<c:if test="${param.NUM1 - param.NUM2 >=0 }" >
	${param.NUM1}
</c:if>

<c:if test="${param.NUM1 - param.NUM2 < 0 }" >
	${param.NUM2}
</c:if>

</body>
</html>