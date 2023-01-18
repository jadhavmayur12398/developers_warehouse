package com.jspiders.jdbc3.callablestatement;

import java.io.FileReader;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcCall {
	public static Connection connection;
	public static CallableStatement callableStatement;
	public static ResultSet resultSet;
	public static Properties properties = new Properties();
	public static FileReader fileReader;
	public static String filepath = "F:\\WEJE2\\jdbc3\\src\\com\\jspiders\\jdbc3\\callablestatement\\JdbcCall.java";
	private static String query;
	
	public static void main(String[] args) {
		try {
			fileReader = new FileReader(filepath);
			
			properties.load(fileReader);
			
			Class.forName(properties.getProperty("driverpath"));
			
			connection = DriverManager.getConnection(properties.getProperty("dbrl"), properties);
			
			query = "call proc2()";
			
			callableStatement=connection.prepareCall(query);
			resultSet = callableStatement.executeQuery();
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1) + "|" + resultSet.getString(2) + "|" + resultSet.getString(3));
				
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (resultSet != null) {
				try {
					resultSet.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (callableStatement != null) {
				try {
					callableStatement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
