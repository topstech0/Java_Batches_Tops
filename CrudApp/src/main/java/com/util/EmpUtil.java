package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmpUtil {

	public static Connection createConnection()
	{
		Connection conn = null;
		try {
			// Import the Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// Establish the Connection.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/april13", "root", "");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
