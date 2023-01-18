package com.jspiders.jdbcdemo.firstpro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql//localhost:3306/sycs","root","root");
			
			System.out.println("connection created");
			String query="create table student(roono int,name varchar(20))";
			
			Statement st = con.createStatement();	// to run query
			
			System.out.println("statement created");
			
			st.execute(query);
			
			System.out.println("table created");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
