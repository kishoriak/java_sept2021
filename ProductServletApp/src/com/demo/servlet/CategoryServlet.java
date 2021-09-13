package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.Category;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

@WebServlet("/getcategory")
public class CategoryServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		    PrintWriter out=response.getWriter();
		    response.setContentType("text/html");
            ProductService pservice=new ProductServiceImpl();
            List<Category> clist=pservice.getAllCategory();
            out.println("<script src='./js/myscript.js'></script>");
            out.println("<form><select name='cid' id='categorylist' onchange='getProductByCategory()'>");
            for(Category c:clist) {
            	out.println("<option value='"+c.getCid()+"'>"+c.getCname()+"</option>");
            }
            
            out.println("</select>");
            out.println("<div id='mydiv'></div></form>");            
            
	}

}
