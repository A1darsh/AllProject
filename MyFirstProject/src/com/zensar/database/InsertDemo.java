package com.zensar.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {
		Connection con=null;
		
		Statement smt=null;
		PreparedStatement ps=null;
		Scanner sc=null;
		try {
			
			
			con=ConnectionProvider.getConnection();
			//smt=con.createStatement();
			
			
			
			 sc=new Scanner(System.in);
			System.out.println("enter student id");
			int id=sc.nextInt();
			
			System.out.println("enter student name");
			String name=sc.next();
			
			System.out.println("enter student age");
			int age=sc.nextInt();
			
			//int count=smt.executeUpdate("insert into student values("+id+",'"+name+"',"+age+");");
			
			
			ps=con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, id);
			ps.setString(2,name);
			ps.setInt(3,age);
			
			int count=ps.executeUpdate();
			if(count>0) {
				System.out.println("inserted successfully");
			}else {
				System.out.println("record insertion faild");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sc!=null) {
				sc.close();
			}
			if(smt!=null) {
				try {
					smt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}

}
}
