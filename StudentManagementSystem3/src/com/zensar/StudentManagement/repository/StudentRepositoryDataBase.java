package com.zensar.StudentManagement.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.zensar.StudentManagement.entity.Student;

public class StudentRepositoryDataBase implements StudentRepository  {
	Student student=new Student();
	Student[] studentarray = new Student[10];
	DatabseConnection databseConnection=new DatabseConnection();
	@Override
	public int insertStudent(Student students) {
		try (Connection con=databseConnection.createC(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("insert into student values(" + student.getStudentId() + ",'" +student.getStudentName()+ "'," + student.getStudentAge() + ")");
			if (count > 0) {
				System.out.println("insert successfully");
			} else
				System.out.println("not insert successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@Override
	public Student[] displayStudent() {
		try (Connection con=databseConnection.createC();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from student");) {
			while (rs.next()) {
				System.out.println(
						rs.getInt("studentId") + " " + rs.getString("studentName") + " " + rs.getInt("studentAge"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return studentarray;
		
		
	}

	@Override
	public int deleteStudent(int id1) {
		try (Connection con=databseConnection.createC(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("DELETE FROM student WHERE studentId=" + id1 + "");
			if (count > 0) {
				System.out.println("delete successfully");
			} else
				System.out.println("not delete successfully");
			ResultSet rs = st.executeQuery("select * from student");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
		
	}

	@Override
	public int updateStudent(int id1) {
		try (Connection con=databseConnection.createC(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("UPDATE student SET studentName = '" +student.getStudentName() + "',studentAge=" + student.getStudentAge()
					+ ",studentId =" + student.getStudentId()+ " WHERE studentId = " + id1 + "");
			if (count > 0) {
				System.out.println("update successfully");
			} else
				System.out.println("not update successfully");
		}
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
