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
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			
			//Cookie c1 = new Cookie();
			session.setAttribute("keyName", "John");
			session.setAttribute("keyDept", "Admin");
	%>
			<h4>Welcome Dear Admin</h4>
			<h4><a href="home.jsp">Enter Home</a></h4>
	<%
		}else{
			
			response.sendRedirect("https://www.google.co.in");
			
	%>
			<h4>Invalid Login</h4>
	<%		
		}
	%>

</body>
</html>