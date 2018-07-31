<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
		<h3>책소개</h3>

		<c:forEach var="goodsInfoList"  items="${GoodsInfoList}">
			코드: ${goodsInfoList.gcode }  <br/>
			제목: ${goodsInfoList.title }  <br/>
			저자: ${goodsInfoList.writer } <br/>
			가격: ${goodsInfoList.price }  <br/><br/>
		</c:forEach>
</body>
</html>