package com.SecondProject;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstClass extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		String name=req.getParameter("name");
		resp.getWriter().println("<h2>Welcome " + name + " to my Website</h2>");
		resp.getWriter().println("<h2><a href='SecondClass'>Go to Second Class</a></h2>");
	}
	

}
