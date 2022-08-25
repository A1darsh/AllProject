package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection(
					"jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22", "root", "ZensarRoot");

			Statement smt = con.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the studnet id");
			int id = sc.nextInt();
			System.out.println("enter the studnet name");
			String name = sc.next();
			System.out.println("enter the studnet age");
			int age = sc.nextInt();

			int count = smt.executeUpdate("UPDATE student SET studentName = '" + name + "',studentAge=" + age
					+ " WHERE studentId = " + id + "");

			if (count > 0) {
				System.out.println("UPDATE successfully");
			} else {
				System.out.println("record updation faild");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
