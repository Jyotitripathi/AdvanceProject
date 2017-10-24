package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet({ "/LoginServlet", "/Login" })
public class LoginServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Extracting data from Client's Request
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		
		// Show back the response to the Client
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(email.equals("admin@example.com") && password.equals("password123")){
			out.print("<h4>Login is a Success</h4>");
			
			// Extract data from DB (Name and Age)
			String name = "John Watson";
			int age = 20;
			
			// 1. Cookie
			/*Cookie c1 = new Cookie("keyName", name);
			Cookie c2 = new Cookie("keyAge", String.valueOf(age));
			
			response.addCookie(c1);
			response.addCookie(c2);
			
			out.print("<a href='Welcome'> Enter Home </a>");*/
			
			// 2. URL Re Writing
			//out.print("<a href='Welcome?keyname="+name+"&age="+age+"'> Enter Home </a>");
			
			// 3. Hidden Form Field
			/*out.print("<form action='Home' method='post'>");
			out.print("<input type='hidden' name='txtName' value='"+name+"'>");
			out.print("<input type='hidden' name='txtAge' value='"+String.valueOf(age)+"'/>");
			out.print("<input type='submit' value='Enter Home'>");
			out.print("</form>");*/
			
			// Http Session
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyAge", String.valueOf(age));
			
			out.print("<a href='Welcome'> Enter Home </a>");
			
		}else{
			out.print("<h4>Login is a Failure</h4>");
		}
	}

}
