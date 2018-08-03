<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
   
<!DOCTYPE html PUBLIC "-//W3C//Dtd XHTML 1.0 transitional//EN" "http://www.w3.org/tr/xhtml1/Dtd/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>windows7K</title>
</head>
<body>
      <h1>한빛미디어</h1>
        <table border="1" cellpadding="10">
            <tr>
                <td width="150" valign="top">
                	<c:choose>
                		<c:when test="${sessionScope.LOGIN_ID==null}">
                			<a href="<%= request.getRequestURI() %>?BODY_PATH=LoginForm.html">로그인</a><br/>
                		</c:when>
                		<c:otherwise>
                			<a href="../logout">로그아웃</a><br/>
                		</c:otherwise>
                	</c:choose>
                    <a HREF="<%= request.getRequestURI() %>?BODY_PATH=Intro.html">회사 소개</a><br/>
                    <a HREF="../books-info">책 정보</a><br/>
                    <a HREF="<%= request.getRequestURI() %>?BODY_PATH=BBSInput.html">게시판 글쓰기</a><br/>
                    <a HREF="../bbs-list">게시판 글읽기</a><br/>
                </td>
                <td valign="top" width="650">
                     <jsp:include page="${param.BODY_PATH}" />
                    
                </td>
            </tr>
        </table>
        <h5>Copyright@ 1993-2010 한빛미디어(주)</h5>
</body>
</html>