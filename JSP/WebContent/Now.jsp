<?xml version="1.0" encoding="UTF-8" ?>
<%@ page import="java.util.*" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%	GregorianCalendar now = new GregorianCalendar(); %>

[현재의 시각] <%= String.format("%TF %TT", now, now)%>