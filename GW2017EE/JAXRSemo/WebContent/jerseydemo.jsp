<%@page import="javax.ws.rs.core.MediaType"%>
<%@page import="javax.ws.rs.client.WebTarget"%>
<%@page import="javax.ws.rs.core.UriBuilder"%>
<%@page import="javax.ws.rs.client.ClientBuilder"%>
<%@page import="javax.ws.rs.client.Client"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	
	ClientConfig config1 = new ClientConfig();
	Client client = ClientBuilder.newClient(config1);
	
	WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/JAXRSemo").build());
	
	String plain = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
	String html = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
	String xml = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);

	out.print(plain+"<br>");
	out.print("----------------------------<br>");
	out.print(html+"<br>");
	out.print("----------------------------<br>");
	out.print(xml+"<br>");
	out.print("----------------------------<br>");

%>

</body>
</html>