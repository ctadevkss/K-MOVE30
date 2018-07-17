<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%
	String cp = request.getContextPath();
	request.setCharacterEncoding("UTF-8");

	//쿠키 가져오기
	Cookie [] ck = request.getCookies();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>오늘의 본상품 목록 나오게 하기</title>
</head>
<body>
상품목록
<br />
<table width="200" border="1">
	<tr height="25">
		<td width="100">상품명</td>
		<td width="100">단가</td>
	</tr>
	<tr height="25">
		<td width="100"><a href="shop1.jsp">세탁기</a></td>
		<td width="100">100</td>
	</tr>
	<tr height="25">
		<td width="100"><a href="shop2.jsp">냉장고</a></td>
		<td width="100">200</td>
	</tr>
	<tr height="25">
		<td width="100"><a href="shop3.jsp">TV</a></td>
		<td width="100">150</td>
	</tr>
</table>

<BR />
오늘본 상품 목록
<br />
<%
	if (ck != null) {
		for (Cookie c : ck) {
			if (c.getName().indexOf("sname") != -1) {

				out.println(java.net.URLDecoder.decode(c.getValue(),"UTF-8") + "<br/>");
				out.println("<img src='http://i.011st.com/ex_t/R/212x212/1/85/10/src/pd/18/5/2/3/3/1/3/nYWpg/1910523313_L300.jpg'");
			}
		}
	}
%>
</body>
</html>