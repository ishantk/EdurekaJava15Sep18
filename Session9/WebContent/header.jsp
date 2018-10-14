<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Header</title>
</head>
<body>
	
	<center>
		<br/>
		===========================================
		<h3>Edureka Learning Management System</h3>
		<h4>www.edureka.co</h4>
		<% 
			Date date = new Date();
		%>
		<h4><%= date %></h4>
		===========================================
		<br/>
	</center>
	
</body>
</html>