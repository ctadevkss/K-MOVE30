<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<h3>이 달에 가장 많이 팔린 과일 </h3>

	<c:forEach items="${FRUITS}" var="fruits" varStatus="status">
	  ${status.count}등 ${fruits} <br/>
	</c:forEach>
<%--  
1등. ${FRUITS[0]} <br/>
2등. ${FRUITS[1]} <br/>
3등. ${FRUITS[2]} <br/> 
 --%>



</body>
</html>