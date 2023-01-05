package com.ref.jdbc.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class JDBCConnectionExample {
	public static void main(String args[]) {
		boolean isAlive = true;
		int opt;
		try (Scanner sc = new Scanner(System.in)) {
			while (isAlive) {
				System.out.println("1) Create Mark Details\n" + "2) Update Mark Details\n" + "3) Delete Mark Details\n"
						+ "4) Print Mark Details\n" + "5) Exit");
				System.out.println("Please enter the Option :");
				try {
					opt = sc.nextInt();
					switch (opt) {
					case 1:
						createMarkDetails(sc);
						break;
					case 2:
						updateMarkDetails(sc);
						break;
					case 3:
						deleteMarkDetails(sc);
						break;
					case 4:
						printMarkDetails();
						break;
					case 5:
						System.exit(0);
						break;
					default:
						System.out.println("Invalid ENtry!!!!");
						break;

					}

				} catch (Exception e) {
					System.err.println("Issue in method");
				}

			}
		}

	}

	private static void deleteMarkDetails(Scanner sc) throws SQLException {

		Connection con = null;
		try {
			System.out.println("Started!!!!!");
			con = JDBCConnectionProvider.getConnection();
			PreparedStatement stmt = con.prepareStatement("delete from marks where mark_id = ?");
			System.out.println("Enter Mark ID");
			int markId = sc.nextInt();
			stmt.setInt(1, markId);
			int result = stmt.executeUpdate();
			System.out.println(result + " rows deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	private static void updateMarkDetails(Scanner sc) throws SQLException {

		Connection con = null;
		try {
			System.out.println("Started!!!!!");
			con = JDBCConnectionProvider.getConnection();
			PreparedStatement stmt = con.prepareStatement(
					"update marks set Student_id = ?,subject_name = ?, mark = ? where mark_id = ?");
			System.out.println("Enter Mark ID");
			int markId = sc.nextInt();
			System.out.println("Enter Student ID");

			int studentId = sc.nextInt();
			System.out.println("Enter Subject ID");

			String subject = sc.next();
			System.out.println("Enter mark");

			int mark = sc.nextInt();
			stmt.setInt(1, studentId);
			stmt.setString(2, subject);
			stmt.setInt(3, mark);
			stmt.setInt(4, markId);
			boolean result = stmt.execute();
			System.out.println(result + " rows deleted successfully");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	private static void printMarkDetails() throws SQLException {
		Connection con = null;
		try {
			System.out.println("Started!!!!!");
			con = JDBCConnectionProvider.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from marks");
			System.out.println("Mark Id\tStudent_id\tSubject\t\tMarks");
			while (rs.next())
				System.out
						.println(rs.getInt(1) + "\t" + rs.getInt(2) + "\t\t" + rs.getString(3) + "\t\t" + rs.getInt(4));

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}

	private static void createMarkDetails(Scanner sc) throws SQLException {

		Connection con = null;
		try {
			System.out.println("Started!!!!!");
			con = JDBCConnectionProvider.getConnection();
			PreparedStatement stmt = con
					.prepareStatement("insert into marks(Student_id, subject_name, mark) values(?,?,?)");
			System.out.println("Enter Student ID");
			int studentId = sc.nextInt();
			System.out.println("Enter Subject ID");
			String subject = sc.next();
			System.out.println("Enter mark");
			int mark = sc.nextInt();
			stmt.setInt(1, studentId);
			stmt.setString(2, subject);
			stmt.setInt(3, mark);
			boolean result = stmt.execute();
			System.out.println(result + " rows created successfully");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			if (con != null) {
				con.close();
			}
		}

	}
}