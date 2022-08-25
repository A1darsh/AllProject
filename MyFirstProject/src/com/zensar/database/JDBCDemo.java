package com.zensar.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBCDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://my-database.cm6hqiqhanoc.ap-south-1.rds.amazonaws.com/batch22","root", "ZensarRoot");
			
			DatabaseMetaData databaseMetaData=con.getMetaData();
			System.out.println(databaseMetaData.getSQLKeywords());
			System.out.println(databaseMetaData.getSQLStateType());
			Statement smt=con.createStatement();
			
		    ResultSet rs=	smt.executeQuery("select*from student");
			
		    ResultSetMetaData rsmd=rs.getMetaData();
			
			for(int i=1;i<=rsmd.getColumnCount();i++) {
				System.out.println(rsmd.getColumnClassName(i));
				System.out.println(rsmd.getColumnTypeName(i));
				System.out.println(rsmd.getColumnCount());
			
			}
			
		    
		    while(rs.next()) {
				System.out.println(rs.getInt("studentid")+" "+rs.getString("studentName")+" "+rs.getInt("studentAge"));
			}
			
			System.out.println("connected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
