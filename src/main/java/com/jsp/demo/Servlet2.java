package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String temp_name =null;
		
		HttpSession httpSession = req.getSession();
	temp_name=(String)httpSession.getAttribute("sname");
		
	PrintWriter printWriter = resp.getWriter();
	printWriter.print("<html><head><body><h1>Welcome back "+ temp_name +" to my website.</h1></body></head></html>");
	printWriter.print("<a href='servlet3'>Logout</a>");
	}
}
