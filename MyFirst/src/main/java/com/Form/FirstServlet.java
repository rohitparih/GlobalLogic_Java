package com.Form;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	public void doPost(HttpServletRequest reqs, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2>Welcome here</h2>");
		String name = reqs.getParameter("user_name");
		String password = reqs.getParameter("user_password");
		String gender = reqs.getParameter("user_gender");
		String cond = reqs.getParameter("condition");
		if (cond != null) {
			if (cond.equals("checked")) {
				out.println("<h2>Name : " + name + "</h2>");
				out.println("<h2>Password : " + password + "</h2>");
				out.println("<h2>Gender : " + gender + "</h2>");
				
				RequestDispatcher rd1 = reqs.getRequestDispatcher("success");
				rd1.forward(reqs, resp);

			}
		} else {
			out.println("<h2>Not Accepted the terms and Conditions</h2>");

			// Get the object of request Dispatcher
			RequestDispatcher rd = reqs.getRequestDispatcher("Index.html");

			// include
			rd.include(reqs, resp);
		}
	}
}
