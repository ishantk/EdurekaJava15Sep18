<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@ page import="javax.ws.rs.client.WebTarget"%>
<%@ page import="javax.ws.rs.client.ClientBuilder"%>
<%@ page import="javax.ws.rs.client.Client"%>
<%@ page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Client Consuming Web Service</title>
</head>
<body>
	<center>
	<h3>Welcome to REST Web Service Demo</h3>
	<%
		// Consuming Web Service as a Client
		ClientConfig cConfig = new ClientConfig();
		Client client = ClientBuilder.newClient(cConfig);
		String url = "http://localhost:8080/Session14A";
		WebTarget target = client.target(UriBuilder.fromUri(url).build());
								//  /rest/hello
		String plainResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String htmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xmlResponse = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String jsonResponse = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
	%>
	
	Plain Response: <%= plainResponse %>
	<br/>
	HTML Response: <%= htmlResponse %>
	<br/>
	XML Response: <%= xmlResponse %>
	<br/>
	JSON Response: <%= jsonResponse %>
	
	</center>
</body>
</html>