<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<%
	BufferedReader reader = null;
	try{
		String filePath = application.getRealPath("/WEB-INF/songs/Dance_The_Night_Away_TWICE.txt");
		
		reader = new BufferedReader(new FileReader(filePath));
		
		while(true) {
			String str = reader.readLine();
			if(str == null)
				break;
			
			out.println(str + "<br/>");
		}
	}
	catch(FileNotFoundException fileNotExp){
		fileNotExp.printStackTrace();		
	}
	finally{
		try{
			
		}catch(Exception e) {
			
		}
	}
%>
</body>
</html>