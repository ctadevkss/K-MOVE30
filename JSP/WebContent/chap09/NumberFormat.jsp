<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
	
	<fmt:setLocale value="en_us" />

	첫번째 수: <fmt:formatNumber value="1234500" groupingUsed="true" /> <br/>
	
	두번째 수: <fmt:formatNumber value="3.14158" pattern="#.##" /> <br/> 
	
	세번째 수: <fmt:formatNumber value="10.5"    pattern="#.00" /> <br/>
	
	네번째 수: <fmt:formatNumber value="0.5"     type="percent" /> <br/>
	
	다번째 수: <fmt:formatNumber value="2500000" type="currency" /> <br/>
	
</body>
</html>












