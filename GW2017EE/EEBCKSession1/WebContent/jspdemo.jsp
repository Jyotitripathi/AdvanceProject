<%@page import="com.auribises.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="errorpage.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Welcome to JSP Demo</h4>
	
	<br/>
	Scriptlet:
	<br/>
	<% 
		int a = 10;
		int b = 20;
		int c = a+b;
		out.print("c is: "+c);
		
		int arr[] = {10,20,30,40,50};
		out.print(arr[1]);
		/*try{
			out.print(arr[10]);
		}catch(Exception exception){
			out.print(exception);
		}*/
		
	%>
	
	<br/>
	Declarative:
	<br/>
	<%! 
		int x = 100;
		int square(int num){
			return num*num;
		}
	%>
	<br/>
	<br/>
	Expression:
	<br/>
	Square of 5 is: <%= square(5)%>
	<br/>
	Square of 7 is: <% out.print(square(7));%>
	
	<br/>
	JSP Action Tags
	<br/>
	
	<%-- <jsp:include page="printdate.jsp"/> --%>
	<%-- <jsp:forward page="printdate.jsp"/> --%>
	
	<br/>
	Object Creation
	<br/>
	<%
		// Create a Java Object
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("John");
		out.print(s1.getRoll()+" - "+s1.getName());
	%>
	<br/>
	<jsp:useBean id="s2" class="com.auribises.Student"/>
	<jsp:setProperty property="roll" name="s2" value="102"/>
	<jsp:setProperty property="name" name="s2" value="Jennie"/>
	
	<br/>
	Student Details:
	<br/>
	Student Roll : <jsp:getProperty property="roll" name="s2"/>
	<br/>
	Student Name : <jsp:getProperty property="name" name="s2"/>
	<br/>
	
</body>
</html>