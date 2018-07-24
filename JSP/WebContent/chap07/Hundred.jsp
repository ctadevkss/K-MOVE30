<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int sum = 0;
	
	for(int cnt=1; cnt<=100; cnt++)
		sum += cnt;
	
	//request.setAttribute("Result", sum);
	request.setAttribute("Result", new Integer(sum));
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("HundredResult.jsp");
	dispatcher.forward(request, response);
%>