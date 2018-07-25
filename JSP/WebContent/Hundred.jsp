<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>1부터 10까지의 곱</title>
</head>
<!-- 이것은 JSP에 생성된 HTML 문서입니다. -->
<body>

<h3> 1부터 100까지 더하는 반복문</h3>
<%-- 다음은 데이터를 처리하는 스크립틀릿입니다. --%>
<%
	int total = 0; // 곱을 저장하는 변수 

	/* 1부터 100까지 더하는 반복문 */
	for(int cnt=1; cnt<=100; cnt++)
	total += cnt;
%>

1+2+3+4+5+...+100 = <%=total %>
</body>
</html>