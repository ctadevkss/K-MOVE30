<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" import="java.io.*, java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	private PrintWriter logFile;

	public void jspInit() {
		String fileName = "C:\\data2\\dateTime_log.txt";
		
		try{
				logFile = new PrintWriter(new FileWriter(fileName, true));
		}
		catch(IOException e) {
			System.out.printf("%TF - %s 파일을 열 수 없습니다. %n", 
								new GregorianCalendar(), fileName);
		}
	}
%>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
<%
	GregorianCalendar now = new GregorianCalendar();
	String date = String.format("현재날짜: %TY년 %Tm월 %Te일", now, now, now);
	String time = String.format("현재시각: %TI시 %TM분 %TS초", now, now, now);
	
	out.println(date + "<br/>");
	out.println(time + "<br/>");
	
	if(logFile != null)
		logFile.printf("%TF %TT에 호출되었습니다. %n", now, now);
	
%>
</body>
</html>


<%!
	public void jspDestroy() {
		if(logFile != null)
			logFile.close();
	}
%>