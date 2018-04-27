<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*"  %>
<!-- 이다은 수정함 -->    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloWorld</title>
</head>
<body>
<h1>Hello World. JSP</h1>
<%
 java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
 String today = formatter.format(new java.util.Date());

 out.println("현재시간:" + today);
%>
</body>
</html>