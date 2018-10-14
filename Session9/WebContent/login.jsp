<%@ page import="co.edureka.db.JDBCHelper"%>
<%@ page import="co.edureka.model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>
	
	<h3>Logging In ${param.txtEmail} </h3>

	<%
		//1. Extracting the Data from Client Request
		User user = new User();
		user.email = request.getParameter("txtEmail");
		user.password = request.getParameter("txtPassword");
		
		//2. Save the Data in DB
		JDBCHelper helper = new JDBCHelper();
		helper.createConnection();
		boolean login = helper.loginUser(user);
		helper.closeConnection();
		
		//3. Send Back the Response
		if(login){
			
			//1. Cookies
			Cookie ck1 = new Cookie("keyName","George Watson");
			Cookie ck2 = new Cookie("keyEmail",user.email);
			
			response.addCookie(ck1);
			response.addCookie(ck2);
			
			//Explore - URL ReWriting & HiddenFormFields
			
			//2. HttpSession
			session.setAttribute("keyName", "George Watson");
			session.setAttribute("keyEmail",user.email);
			
			pageContext.setAttribute("keyName", "George Watson", PageContext.SESSION_SCOPE);
			
	%>
	
		
		<h3><i>Login Successful for <%= user.email %></i></h3>
		<!-- <a href="welcome.jsp">Enter Home</a> -->
		<jsp:forward page="welcome.jsp"/>
		
	
		
	<%		
		}else{
			response.sendRedirect("https://www.google.co.in");
	 %>
	 	<h3><i>Login Failed for <%= user.email %></i></h3>
	 <%		
		}
	%>
</body>
</html>