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
<%
	int total = 0;

	for(int cnt=1; cnt<=100; cnt++)
	total += cnt;
%>
1부터 100까지의 합 = <%=total %> <br/>

<%
	/* 
	   int total = 0; 
	*/

	for(int cnt=101; cnt<=200; cnt++)
	total += cnt;
%>
1부터 200까지의 합 = <%=total %> <br/>


<%
	int total2 = 0;
	int cnt;
	for(cnt=1; cnt<=6; cnt++)
		total2 += cnt;
%>
1부터 <%=cnt %>까지의 합 = <%=total2 %> <br/>






</body>
</html>