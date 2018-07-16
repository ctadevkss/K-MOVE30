<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" import="java.util.* , java.io.*, java.text.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<h2>글쓰기</h2>
<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("NAME");
	String title = request.getParameter("TITLE");
	String content = request.getParameter("CONTENT");
	String result;
	
	
	SimpleDateFormat simpleDateFormat = 
			new SimpleDateFormat ( "yyyy.MM.dd HH_mm_ss", Locale.KOREA );
	Date currentTime = new Date ();
	String strTime = simpleDateFormat.format ( currentTime );
	
	String fileName = strTime + ".txt";
	
	PrintWriter writer = null;
	
	try{
		String filePath = application.getRealPath("/WEB-INF/bbs/" + fileName);
		
		writer = new PrintWriter(filePath);
		writer.printf("제목: %s %n", title);
		writer.printf("글쓴이: %s %n", name);
		writer.printf(content);
		result = "SUCCESS";
		out.print( filePath + " 위치에 " + fileName + " 이름으로 저장되었습니다");
	}
	catch(IOException ioe) {
		result = "FAIL";
		ioe.printStackTrace();
	}
	finally{
		try{
			writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	response.sendRedirect("BBSPostResult.jsp?RESULT=" + result);

%>
</body>
</html>





