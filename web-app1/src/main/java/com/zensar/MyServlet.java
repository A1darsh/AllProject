package com.zensar;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {

	public void service(HttpServletRequest reqyest, HttpServletResponse response) throws IOException {

		PrintWriter writer = response.getWriter();
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<h2>welcom to servlet</h2>");
		writer.print("<body>");
		writer.print("<head>");

	}
}