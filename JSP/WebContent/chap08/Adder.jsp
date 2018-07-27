<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>두수의 합</title>
</head>
<body>
	<jsp:scriptlet>
		String str1 = request.getParameter("NUM1");
		String str2 = request.getParameter("NUM2");
	
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		int sum = add(num1, num2);
	</jsp:scriptlet>
	두수의 합은<jsp:expression>sum</jsp:expression> 입니다.
</body>
</html>

<jsp:declaration>
	private int add(int num1, int num2) {
		return num1 + num2;	
	}
</jsp:declaration>