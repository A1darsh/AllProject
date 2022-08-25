package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecord {
	
	public static void main(String[] args) {
			Connection con=null;
			try {
				con=ConnectionProvider.getConnection();
				Statement smt=con.createStatement();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the studnet id");
				int id=sc.nextInt();
				
				
				int count=smt.executeUpdate("DELETE FROM student WHERE studentId="+id+"");
				
				if(count>0) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("record insertion faild");
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


}
