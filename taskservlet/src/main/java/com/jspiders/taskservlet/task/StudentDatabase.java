package com.jspiders.taskservlet.task;

import java.io.IOException;
import java.io.PrintWriter;
//import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentDatabase
 */
@WebServlet("/registration")
public class StudentDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentDatabase() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter Writer = response.getWriter();
		
//		Writer.println("<h1>You have successfully registered....!</h1>");
		
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String add = request.getParameter("add");
		String country = request.getParameter("country");
		String state = request.getParameter("state");
		String dob = request.getParameter("dob");
		String clgname = request.getParameter("clgname");
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2?user=root&password=root");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?)");
			
			preparedStatement.setString(1, fname);
			preparedStatement.setString(2, lname);
			preparedStatement.setString(3, email);
			preparedStatement.setString(4, contact);
			preparedStatement.setString(5, add);
			preparedStatement.setString(6, country);
			preparedStatement.setString(7, state);
			preparedStatement.setString(8, dob);
			preparedStatement.setString(9, clgname);
			
			int i = preparedStatement.executeUpdate();
			
			Writer.println( fname +"<h1>You have successfully registered....!</h1>");
			
			if (i>0) {
				System.out.println("You are successfully registered");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
