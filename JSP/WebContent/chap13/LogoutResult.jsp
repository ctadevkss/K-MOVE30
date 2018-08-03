<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   

<h4>로그아웃</h4>
    
<c:choose>
	<c:when test="${param.LOGOUT_RESULT=='SUCCESS'}">
		로그아웃이 되었습니다. <br/>
	</c:when>
	<c:otherwise>
		로그아웃에 실패했습니다. <br/>
	</c:otherwise>
</c:choose>