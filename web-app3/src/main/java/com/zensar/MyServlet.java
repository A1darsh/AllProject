package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/MyServlet")
public class MyServlet implements Servlet {

	public void destroy() {
		System.out.println("going to distroy");
		
	}
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("initilizing the object");
		
	}

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h2>this is created by adarsh mishra</h2>");
		out.println("<h2>do whatever you want to do</h2>");
		
		
	}
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
