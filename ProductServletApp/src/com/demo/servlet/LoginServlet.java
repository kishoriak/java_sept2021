package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		if(uname.equals("admin") && pass.equals("admin")){
			RequestDispatcher rd=request.getRequestDispatcher("addition.html");
			rd.forward(request, response);
		}
		else {
			out.println("<h1>pls renenter credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
			
		}
	}

}
