<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

	입력된 수 <%= request.getParameter("NUM1") %>, 
	          <%= request.getParameter("NUM2") %>              <br/>
	
	덧셈의 결과는?   <%= request.getAttribute("SUM") %>        <br/>
	뺄셈의 결과는?   <%= request.getAttribute("DIFFERENCE") %> <br/>
	곱셈의 결과는?   <%= request.getAttribute("PRODUCT") %>    <br/>
	나눗셈의 결과는? <%= request.getAttribute("QUOTIENT") %>   <br/>
</body>
</html>