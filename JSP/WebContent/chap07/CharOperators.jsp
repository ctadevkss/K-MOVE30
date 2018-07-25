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
        ${param.NUM1}을 ${param.NUM2}로 나눈 몫은? ${param.NUM1 div param.NUM2} <br/>
        나머지는? ${param.NUM1 mod param.NUM2} <br/><br/>
        둘 다 양수입니까? ${(param.NUM1 gt 0) and (param.NUM2 gt 0)} <br/>
        둘 다 음수입니까? ${(param.NUM1 lt 0) and (param.NUM2 lt 0)} <br/>
</body>
</html>