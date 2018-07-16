<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String str1 = request.getParameter("NUM1");
	String str2 = request.getParameter("NUM2");
	
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	
	request.setAttribute("SUM",        new Integer(num1 + num2));
	request.setAttribute("DIFFERENCE", new Integer(num1 - num2));
	request.setAttribute("PRODUCT",    new Integer(num1 * num2));
	request.setAttribute("QUOTIENT",   new Integer(num1 / num2));
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("FourRulesResult.jsp");
	dispatcher.forward(request, response);

%>    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

</body>
</html>