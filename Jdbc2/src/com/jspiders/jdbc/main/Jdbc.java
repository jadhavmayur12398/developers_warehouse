package com.jspiders.jdbc.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {
	public static void main(String[] args) {
		try {
//			load the driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			open connection
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/weje2","root","root");
			
//			create statement
			Statement statement = connection.createStatement();
			
			ResultSet resultset = statement.executeQuery("select * from student");
			
//			process the result
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + resultset.getString(2) + resultset.getString(3) + resultset.getString(4));
							}
			
//			close connection
			connection.close();
			statement.close();
			resultset.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
