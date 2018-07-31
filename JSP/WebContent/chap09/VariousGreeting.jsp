<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>   

<c:set var="greeting" value="How Are You?" />
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	본래의 문자열 : ${greeting } <br/>
	모두 대문자로 : ${fn:toUpperCase(greeting) } <br/>
	모두 소문자로 : ${fn:toLowerCase(greeting) } <br/>
	Are의 위치는? : ${fn:indexOf(greeting, "Are") } <br/>
	Are를 Were 로 바꾸면 : ${fn:replace(greeting, "Are", "Were") } <br/>
	문자열의 길이는? : ${fn:length(greeting) } <br/>
</body>
</html>