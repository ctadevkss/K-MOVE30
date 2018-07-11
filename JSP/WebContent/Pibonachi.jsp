<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>피보나치 수열 100이하 출력</h1>
<%
	int a = 1, b = 1 , c = 0;
%>

<%=a %>
<%=b %>

<%
	while(true) {
		c = a + b;
		a = b;
		b = c;

		if(c < 100) { 
%>
		<%=c %>
<%
		}
	 	else 
			break;
	 	
	}
%>
</body>
</html>