<%@ page import="co.edureka.model.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp" %>    
<%@ page buffer="8kb" %>
<%@ page isThreadSafe="true" %>
<%@ include file="header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP Demo</title>
</head>
<body>

	<center>
	
		<c:forEach var="i" begin="1" end="10">
			<b><i></>i is: ${i} </i></b><br/>
		</c:forEach>
		
		<c:set var="age" value="20"/>
		<%-- <c:redirect url="https://www.google.co.in"/> --%>
	
		<br/>
		<h3>Welcome to JSP Demo</h3>
	
		<%-- <h3>c is: <% out.print(c); %></h3>  Not Accessible Above Declaration--%>
		<h3>pi is: <% out.print(pi); %></h3>
	
		<h3>Scriptlet Tag Demo:</h3>
		<%
			int a = 10;
			int b = 20;
			int c = a+b;
			out.print("c is: "+c+"<br/>"); // out is a ref var pointing to the Object of PrintWriter
			
			for(int i=1;i<=10;i++){
				out.print("i is: "+i+"<br/>");
			}
			
		%>
		<h3>c is: <% out.print(c); %></h3>
		<h3>pi is: <% out.print(pi); %></h3>
		
		<jsp:include page="header.jsp"/>
		
		
		<h3>Declaration Tag Demo:</h3>
		<%!
			double pi = 3.14;
		
			double calculateArea(double radius){
				double area = pi * radius * radius;
				return area;
			}
			
			class Student{
				int roll;
				String name;
			}
			
		%>
		<h3>Area of circle with radius 5.75 is: <% out.print(calculateArea(5.75)); %></h3>
		
		<h3>Expression Tag Demo:</h3>
		<h3>Area of circle with radius 7.75 is: <%= calculateArea(7.75) %></h3>
		
		<%
			int[] arr = {10, 20, 30,40, 50};
			out.print("<h3>arr[0] is: "+arr[0]+"</h3>");
			/*try{
				out.print("<h3>arr[10] is: "+arr[10]+"</h3>");
			}catch(Exception e){
				out.print("Some Exception: "+e);
			}*/
		%>
		
		<%
			Book book1 = new Book();
			book1.setIsbn("IN0142");
			book1.setName("Java Essentials");
			book1.setAuthor("John");
		%>
		
		ISBN:<%= book1.getIsbn() %><br/>
		NAME:<%= book1.getName() %><br/>
		AUTHOR:<%= book1.getAuthor() %><br/>
		
		<jsp:useBean id="book2" class="co.edureka.model.Book" />
		<jsp:setProperty property="isbn" name="book2" value="IN9087"/>
		<jsp:setProperty property="name" name="book2" value="Data Structures"/>
		<jsp:setProperty property="author" name="book2" value="George"/>
		
		<br/>
		==========================
		<br/>
		
		ISBN: <jsp:getProperty property="isbn" name="book2"/><br/>
		NAME: <jsp:getProperty property="name" name="book2"/><br/>
		AUTHOR: <jsp:getProperty property="author" name="book2"/><br/>
		
	</center>

</body>
</html>