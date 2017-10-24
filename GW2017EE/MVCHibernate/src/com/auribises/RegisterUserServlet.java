package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class RegisterUserServlet
 */
@WebServlet({ "/RegisterUserServlet", "/Register" })
public class RegisterUserServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("txtEmail");
		String password = request.getParameter("txtPassword");
		
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if(registerUser(user)){
			out.print("You are successfully Registered");
			// Code to proceed further
		}else{
			out.print("You are not successfully Registered");
		}
	}
	
	// Business Method
	boolean registerUser(User u){
		
		// Execute our Hibernate Code
		Configuration config=null;
		SessionFactory factory=null;
		Session session=null;
		Transaction transaction=null;
		
		try {
			
			config = new Configuration();
			config.configure(); // hibernate.cfg.xml
			
			factory = config.buildSessionFactory();
			
			session = factory.openSession();
			
			transaction = session.beginTransaction();
			
			session.save(u);
			
			transaction.commit();
			
			session.close();
			
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
			return false;
		}
		
		return true;
	}

}
