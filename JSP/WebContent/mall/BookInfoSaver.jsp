<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="pinfo" class="mall.BookInfo" scope="request">
	<jsp:setProperty name="pinfo" property="code"   value="50001"/>
	<jsp:setProperty name="pinfo" property="name"   value="의뢰인"/>
	<jsp:setProperty name="pinfo" property="price"  value="9000"/>
	<jsp:setProperty name="pinfo" property="writer" value="존 그리샴"/>
	<jsp:setProperty name="pinfo" property="page"   value="704"/>
</jsp:useBean>
       
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
 책 정보가 저장되었습니다. <br/>
 ---------------------------------

<h3> 제품 개략 정보</h3>
<jsp:include page="ProductInfo.jsp" />
</body>
</html>