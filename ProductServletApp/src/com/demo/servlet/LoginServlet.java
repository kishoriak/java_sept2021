package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.User;
import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		LoginService lservice=new LoginServiceImpl();
		User user=lservice.validateUser(uname,pass);
		
		if(user!=null){
			RequestDispatcher rd=request.getRequestDispatcher("getcategory");
			rd.forward(request, response);
		}
		else {
			out.println("<h1>pls renenter credentials</h1>");
			RequestDispatcher rd=request.getRequestDispatcher("login.html");
			rd.include(request, response);
			
			
		}
	}

}
