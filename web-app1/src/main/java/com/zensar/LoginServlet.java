package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String userName = request.getParameter("txtUser");
		String userPassword = request.getParameter("passUser");
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		/*
		 * if (userName.equals("Zensar") && userPassword.equals("Zensar@123")) {
		 * writer.print("<h2>authentication successfull</h2>"); } else {
		 * writer.print("<h2>authentication fieled</h2>"); } writer.print("</body>");
		 * writer.print("</body>");
		 */
		
	if(userName.equals("Zensar") && userPassword.equals("Zensar@123")){  
        RequestDispatcher rd=request.getRequestDispatcher("success.html");  
        rd.forward(request, response);  
    }  
    else{   
        RequestDispatcher rd=request.getRequestDispatcher("error.html");  
        rd.forward(request, response);  
                      
        }  
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("txtUser");
		String userPassword = request.getParameter("passUser");
		PrintWriter writer = response.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		if (userName.equals("Zensar") && userPassword.equals("Zensar@123")) {
			writer.print("<h2>authentication successfull</h2>");
		} else {
			writer.print("<h2>authentication fieled</h2>");
		}
		writer.print("</body>");
		writer.print("</body>");
	}
}
