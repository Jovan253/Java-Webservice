package com.in28minutes.servletjsp.web.servlet.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(urlPatterns = {"/*"})
//intercept all urls /*
public class RequestLoggingFilter implements Filter {
	//This filter has auto methods attatched to it

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		//Create header names
		HttpServletRequest req = (HttpServletRequest) request;
		Enumeration<String> headerNames = req.getHeaderNames();
		
		while (headerNames.hasMoreElements()) {
			//get header name
			String headerName = headerNames.nextElement();
			System.out.print(headerName);
			//get header value
			String headerValue = req.getHeader(headerName);
			System.out.println(":" + headerValue);
			//affects console not page
		}		
		//any other filters are wanted to be executed as well
		
		chain.doFilter(request,response);
		
	}

	@Override
	public void init(FilterConfig request) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
