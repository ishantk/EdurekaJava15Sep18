<%@page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>

	<%
		//1. Extracting the Data from Client Request
		User user = new User();
		user.name = request.getParameter("txtName");
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		//2. Save the Data in DB
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		int i = helper.registerUser(user);
		helper.closeConnection();
		
		//3. Send Back the Response
		if(i>0){
	%>
		<h3><i>Registration Successful for <%= user.name %></i></h3>
	<%		
		}else{
	 %>
	 	<h3><i>Registration Failed for <%= user.name %></i></h3>
	 <%		
		}
	%>

</body>
</html>