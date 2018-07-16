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
<h2>글쓰기</h2>

<%
	request.setCharacterEncoding("utf-8");	

	String str = request.getParameter("RESULT");
	if(str.equals("SUCCESS"))
		out.print("저장되었습니다.");
	else
		out.print("파일에 데이터를 쓸수 없습니다.");
%>

</body>
</html>