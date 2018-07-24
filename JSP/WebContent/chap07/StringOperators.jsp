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
        입력 문자열 : ${param.STR1}, ${param.STR2} <br/><br/>
        두 문자열이 같습니까? ${param.STR1 == param.STR2} <br/>
        어느 문자열이 먼저입니까? ${param.STR1 < param.STR2 ? param.STR1 : param.STR2}
</body>
</html>