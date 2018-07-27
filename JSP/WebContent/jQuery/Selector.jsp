<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("button").click(function(){
        //$("h1").slideToggle();
        
    $("h1").css('background-color','red').slideToggle();
        
        
    });
});
</script>

</head>
<body>

<h1 style=""><span class="">&lt;h1&gt;</span>Welcome to My Homepage<span class="markup">&lt;/h1&gt;</span></h1>

<button> $("h1")</button>

</body>
</html>