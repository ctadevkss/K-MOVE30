<?xml version="1.0" encoding="UTF-8" ?>

<%@ page import="chap07.ProductInfo" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    ProductInfo product = new ProductInfo();
    product.setName("초코케이크 3호");
    product.setPrice(20000);
    
    request.setAttribute("PRODUCT", product);
    
    RequestDispatcher dispatcher = request.getRequestDispatcher("ProductInfoView.jsp");
    dispatcher.forward(request, response);
%>    