package com.soft.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reg")
public class CoursesRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sname = request.getParameter("sname");
		String[] qual = request.getParameterValues("squal");
		String squal = "";
		for(String val : qual) {
			squal = squal + val + "<br>";
		}
		
		String sgender = request.getParameter("sgender");
		String[] courses = request.getParameterValues("scourses");
		String scourses = "";
		for(String val : courses) {
			scourses = scourses + val + "<br>";
		}
		
		String branch = request.getParameter("branch");
		String saddr = request.getParameter("saddr");
		
		out.println("<html><body>");
		out.println("<h2 style='color:red;' align='center'>Soft Solutions</h2>");
		out.println("<h3 style='color:blue;' align='center'>Student Registration Details</h2>");
		out.println("<table border ='1' align='center'>");
		out.println("<tr><th>Student Name</th><td>"+sname+"</td></tr>");
		out.println("<tr><th>Student Qualifaction</th><td>"+squal+"</td></tr>");
		out.println("<tr><th>Student Gender</th><td>"+sgender+"</td></tr>");
		out.println("<tr><th>Student Courses</th><td>"+scourses+"</td></tr>");
		out.println("<tr><th>Institute Branch</th><td>"+branch+"</td></tr>");
		out.println("<tr><th>Student Address</th><td>"+saddr+"</td></tr>");
		out.println("</table>");
		out.println("<h2 align='center'><a href='./courses_reg_form.html'>|Courses Registration Page|</a></h2>");
		out.println("</body></html>");
		
	}

}
