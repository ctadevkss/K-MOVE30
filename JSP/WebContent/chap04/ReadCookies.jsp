<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<%
	Cookie cookies[] = request.getCookies();
%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
		이름: <%=getCookieValue(cookies, "NAME") %>
		성별: <%=getCookieValue(cookies, "GENDER") %>
		나이: <%=getCookieValue(cookies, "AGE") %>
</body>
</html>

<%!
	private String getCookieValue(Cookie[] cookies, String name) {
		for(Cookie cookie : cookies) {
			if(cookie.getName().equals(name))
				return cookie.getValue();
		}
	
		return null;
	}


%>


