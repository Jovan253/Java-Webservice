package com.in28minutes.servletjsp.web.servlet.eg;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		   if(request.getParameter("userName") == null) {
			response.setStatus(400, "Bad request");
			response.getWriter().println("Send in a parameter userName");
			return;
		}
		*/
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//user@gmail.com, password
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		request.setAttribute("name", name);
		request.setAttribute("email", email);
		request.setAttribute("password", password);
		
		if(email.equalsIgnoreCase("user@gmail.com") && password.equalsIgnoreCase("password")) {
			//direct user to first page
			request.getRequestDispatcher("/first").forward(request, response);
		}
		else {
			request.setAttribute("error","Invalid ID/Password");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
		
		
	}

}
