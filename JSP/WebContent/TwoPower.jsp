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
	2 ^ 1 = <%=power(2,1) %> <br/>
	2 ^ 2 = <%=power(2,2) %> <br/>
	2 ^ 3 = <%=power(2,3) %> <br/>
	2 ^ 4 = <%=power(2,4) %> <br/>
	2 ^ 5 = <%=power(2,5) %> <br/>
</body>
</html>

<%!
	private int power(int base, int exponent) {
		int result = 1;
		for(int cnt=0; cnt<exponent; cnt++)
			result *= base;
		return result;
	}
%>