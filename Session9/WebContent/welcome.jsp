<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Home</title>
</head>
<body>
	<center>
		<h3>Welcome to Home Dear, <%= session.getAttribute("keyName") %></h3>
		Email: <%= session.getAttribute("keyEmail") %>
		<br/>
		<%
			Date date1 = new Date();
			/* String name = (String)pageContext.getAttribute("keyName", PageContext.SESSION_SCOPE); */
		%>
		<h3>Its: <%= date1 %></h3>
		
		<h3>Cookies:</h3>
		<%
			Cookie[] ckArr = request.getCookies();
			for(Cookie ck : ckArr){
				out.print(ck.getName()+" : "+ck.getValue()+"<br/>");
			}
		%>
		
	</center>
</body>
</html>