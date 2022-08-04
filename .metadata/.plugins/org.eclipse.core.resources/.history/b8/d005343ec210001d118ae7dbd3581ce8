package com.Cookie;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstS extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name =  req.getParameter("name");
		resp.getWriter().println("<h2>Hello " + name + "Welcome to my Website");
		resp.getWriter().println("<h2><a href='SecondC'>Go to Second Class</a></h2>");
		
		//Creating new Cookie
		Cookie c = new Cookie("user_name", name);
		resp.addCookie(c);
	}

}
