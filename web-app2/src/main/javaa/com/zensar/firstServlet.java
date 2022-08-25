package com.zensar;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class firstServlet implements Servlet{

	private ServletConfig conf;

	public void destroy() {
		System.out.println("going to distroy servlet object...");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig conf) throws ServletException {
		this.conf=conf;
		System.out.println("creating object....");
		
	}

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Servecing......");
		
	}

	
}
