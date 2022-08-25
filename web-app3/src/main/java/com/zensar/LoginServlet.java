package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id1 = request.getParameter("id");
		String pass1 = request.getParameter("pass");
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		
		if (id1.equals("Adarsh") && pass1.equals("Adarsh@123")) {
			//out.println("<h2>login successfull</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("success.html");
			rd.forward(request, response); 
		} else {
			//out.println("<h2>not successfull</h2>");
			RequestDispatcher rd= request.getRequestDispatcher("failed.html");
			rd.forward(request, response);
		}
			
	}

}
