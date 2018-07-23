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
		int i, sum = 0;
		int score[] = {92,78,85,83,99,72,86,85,90,95,91};
		
		for(i=0; i<score.length; i++) {
			sum += score[i];
		}
	%>
	
	JSP 과목에 대한 <br/>
	인원은: <%= score.length%>명 이고 <br/>
	총점은: <%= sum %> 점이며         <br/>
	평균은: <%= sum/score.length %> 점이다.
</body>
</html>