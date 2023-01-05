package com.ref.jdbc.example;
import java.sql.Connection;
import java.sql.DriverManager;

class JDBCConnectionProvider {
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school_management_system", "root", "admin123");
			return con;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}