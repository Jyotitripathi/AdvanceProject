package com.auribises;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
       

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		//System.out.println("--init executed--");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		//System.out.println("--destroy executed--");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("--service executed--");
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		String uname = request.getParameter("txtUserName");
		String password = request.getParameter("txtPassword");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		User u = new User();
		u.setEmail(uname);
		u.setPassword(password);
		
		JDBCHelper helper = new JDBCHelper();
		helper.openConnection();
		
		//System.out.println(uname+ " - "+password);
		if(helper.authenticateUser(u)){

			// Retrieve from DB
			String name = "John Watson"; 
			String phone = "+91 99999 99999";
			int age = 20;
			
			// 1. Cookies
			/*Cookie c1 = new Cookie("keyName", name);
			Cookie c2 = new Cookie("keyPhone", phone);
			Cookie c3 = new Cookie("keyAge", String.valueOf(age));
			
			//c1.setMaxAge();
			
			response.addCookie(c1);
			response.addCookie(c2);
			response.addCookie(c3);*/
			
			//2. URL ReWriting
			
			out.print("<html><body>");
			out.print("<h3>Login is Success</h3><br/>");
			
			//out.print("<a href='Home?keyName="+name+"&keyPhone="+phone+"&keyAge="+age+"'>Enter Home</a>");
			
			/*out.print("<form action='Home' method='post'>");
			out.print("<input type='hidden' name='txtName' value='"+name+"'>");
			out.print("<input type='hidden' name='txtPhone' value='"+phone+"'>");
			out.print("<input type='hidden' name='txtAge' value='"+age+"'>");
			out.print("<input type='submit' value='Enter Home'>");
			out.print("</form>");
			out.print("</body></html>");*/
			
			out.print("<a href='Awesome'>Enter Home</a>");
			
			HttpSession session = request.getSession();
			session.setAttribute("keyName", name);
			session.setAttribute("keyPhone", phone);
			session.setAttribute("keyAge", String.valueOf(age));
			
			/*RequestDispatcher dispatcher = request.getRequestDispatcher("Home");
			dispatcher.forward(request, response);*/
			
		}else{
			//out.print("Login is Failure");
			//RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
			//dispatcher.include(request, response);
			
			response.sendRedirect("https://google.co.in");
		}
		
		helper.closeConnection();
	}

}
