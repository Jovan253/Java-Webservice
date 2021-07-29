package com.in28minutes.servletjsp.web.servlet.eg;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		List<String> list = Arrays.asList("BonJovi", "GunsNRoses", "RollingStones", "AC/DC");
		
		request.setAttribute("bestBandsList", list);
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		map.put("RollingStones", 67);
		map.put("GunsNRoses", 45);
		map.put("BonJovi", 35);
		map.put("AC/DC", 75);
		
		request.getSession().setAttribute("millionsSoldMap", map);
		
		request.setAttribute("bandName", "Bon Jovi");
		request.getRequestDispatcher("/WEB-INF/views/first1.jsp").forward(request, response);
		
		
		
	} 
	//POST
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//stops error page as redirected page needs dopost as well as login
		doGet(request, response);
	}

}
