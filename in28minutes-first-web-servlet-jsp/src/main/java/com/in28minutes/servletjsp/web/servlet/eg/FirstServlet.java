package com.in28minutes.servletjsp.web.servlet.eg;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//to reach first servlet we need url
//control space to access things , imports,shortcuts like intellij
@WebServlet(urlPatterns="/first")
public class FirstServlet extends HttpServlet {
//First
//Login
//Second
//Third
	
	//GET
	//localhost:8080 => GET
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// B for bold
		//BR for bold and new line
		//linking a jsp file with html to avoid messiness
		
		
		//displaying messages via jsp and setting an attribute to be used in jsp
		// set name to be able to be used in parameter
		String famousGuitarist = request.getParameter("name");
		request.setAttribute("famousGuitarist", famousGuitarist);
		request.setAttribute("guitarist", "Slash");
		request.getRequestDispatcher("/WEB-INF/views/first1.jsp").forward(request,response);
		
	} 
	//POST
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//stops error page as redirected page needs dopost as well as login
		doGet(request, response);
	}

}
