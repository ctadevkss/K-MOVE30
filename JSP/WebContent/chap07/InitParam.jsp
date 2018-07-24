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
	
	<h2>DB_NAME 초기화 파라미터의 값은? ${initParam.DB_NAME } </h2>
	<h2>TOOL_NAME 초기화 파라미터의 값은? ${initParam.TOOL_NAME } </h2>
	<h2>요청URI: ${pageContext.request.requestURI }</h2>
	
		<%=
				request.getRequestURI()
		%>
</body>
</html>