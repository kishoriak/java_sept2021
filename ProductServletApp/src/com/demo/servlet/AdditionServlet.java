package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		out.println("<h3>Addition : "+(num1+num2)+"</h3>");
	}
}
