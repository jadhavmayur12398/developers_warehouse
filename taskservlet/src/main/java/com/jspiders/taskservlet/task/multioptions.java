package com.jspiders.taskservlet.task;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class multioptions
 */
@WebServlet("/hobbies")
public class multioptions extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public multioptions() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter printWriter = response.getWriter();
		
		String[] strings = request.getParameterValues("hobby");
		
		printWriter.println("<h3>Your selected hobbies are : </h3>");
		
		for(String hobby : strings) {
			printWriter.println(hobby + "<br>");
		}
		
	}

}
