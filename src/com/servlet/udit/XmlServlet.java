package com.servlet.udit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello from GET method");

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String username = request.getParameter("userName");
		out.println("Hello "+username+"!");

		HttpSession session = request.getSession();
		
		session.setAttribute("userName",username);
		
		out.println((String)session.getAttribute("userName"));

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello from Post method");
		
		String userName = request.getParameter("userName");
		
		String fullName = request.getParameter("fullName");
		
		PrintWriter out = response.getWriter();
		
		out.println("Hello "+userName+"!");
		
		out.println("Full Name "+fullName);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("userName",userName);
		
		out.println((String)session.getAttribute("userName"));
	}
	
}
