<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
		String cp=request.getContextPath();
		request.setCharacterEncoding("UTF-8");
		
		//쿠키로 상품명 저장
		Cookie c = new Cookie("sname1",URLEncoder.encode("세탁기","utf-8"));
		c.setMaxAge(60*60*24);
		response.addCookie(c);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
좋은 세탁기 싼가격. ^^<br/>
<a href ="shop.jsp">돌아가기</a>
</body>
</html>