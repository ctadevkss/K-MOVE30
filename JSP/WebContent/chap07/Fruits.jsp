<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	ArrayList<String> items = new ArrayList<String>();
	items.add("딸기");
	items.add("오렌지");
	items.add("복숭아");
	items.add("바나나");
	items.add("망고");
	
	request.setAttribute("FRUITS", items);
	RequestDispatcher dispatcher = request.getRequestDispatcher("FruitsView.jsp");
	dispatcher.forward(request, response); 
%>  