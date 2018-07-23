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
	
	<h2>개인정보 입력 화면</h2>
	이름과 전화번호를 입력하세요.
	<form action="result.jsp" method="post">
		이름:<input type="text" name="name"/> <br/>
		전화번호:<input type="text" name="phone"/>
	
		<input type="submit" value="전송" />
		<input type="reset"  value="취소"/>
	</form>
	
</body>
</html>