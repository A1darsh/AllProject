package com.zensar.StudentManagement.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentToDatabase  {
	
	public static void InsertStudentToDB(int studentId, String studentName, int studentAge) throws SQLException {
		
		PreparedStatement ps;
		Connection con=DataBase.createC();
		
		
			ps=con.prepareStatement("insert into student values (?,?,?)");
			ps.setInt(1, studentId);
			ps.setString(2,studentName);
			ps.setInt(3,studentAge);
		
		
		int count=0;
		try {
			count = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(count>0) {
			System.out.println("inserted successfully");
		}else {
			System.out.println("record insertion faild");
		}
	}
}
