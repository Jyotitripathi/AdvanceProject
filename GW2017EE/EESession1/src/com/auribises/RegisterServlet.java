package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({ "/RegisterServlet", "/Register" })
public class RegisterServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Create Response
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		// Extract data from Request
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		int age = Integer.parseInt(request.getParameter("txtAge"));
		int salary = Integer.parseInt(request.getParameter("txtSalary"));
		
		// Caeser Cipher Technique
		
		User u = new User(0, email, password, age, salary);
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		int i = helper.registerUser(u);
		
		if(i>0){
			out.print("You are successfully registered");
		}else{
			out.print("OOPS! Some Problem, Please try again later !");
		}
		
		helper.closeConnection();
	}

}
