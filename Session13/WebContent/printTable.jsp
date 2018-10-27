<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	// Reads the Number from HTTP Request 
	String number = request.getParameter("number");
	
	try{
		
		// Convert String into Integer	
		int num = Integer.parseInt(number);
		
		// Calculate Table of a Number and Send back as Respone
		for(int i=1;i<=10;i++){
			out.print("<b><i>"+num+" "+i+"'s are "+(num*i)+"</i></b><br/>");
		}
		
	}catch(Exception e){
		out.print("Enter a Valid Number");
	}
	
%>