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
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/HomeServlet", "/Home", "/Welcome" })
public class HomeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h3>Welcome Home Dear User</h3><br/>");
		
		/*String name = request.getParameter("txtName");
		String phone = request.getParameter("txtPhone");
		String age = request.getParameter("txtAge");*/
		
		HttpSession session = request.getSession();
		String name = (String)session.getAttribute("keyName");
		String phone = (String)session.getAttribute("keyPhone");
		String age = (String)session.getAttribute("keyAge");
		
		String id = session.getId();
		//session.getLastAccessedTime();
		//session.invalidate();
		
		out.print("Name: "+name+"<br/>");
		out.print("Phone: "+phone+"<br/>");
		out.print("Age: "+age+"<br/>");
		
		System.out.println("name: "+name);
		
		/*Cookie[] ckArr = request.getCookies();
		for(Cookie ck : ckArr){
			out.print(ck.getName()+" - "+ck.getValue()+"<br/>");
		}*/
		
		out.print("</body></html>");
	}

}
