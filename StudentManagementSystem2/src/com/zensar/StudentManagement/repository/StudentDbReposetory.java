package com.zensar.StudentManagement.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.student.db.ConnectionProvider;

public class StudentDbReposetory implements StudentRepository {


	@Override
	public int insertStudent(int id, String name, int age) {
		try (Connection con = ConnectionProvider.getConnection(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("insert into student values(" + id + ",'" + name + "'," + age + ")");
			if (count > 0) {
				System.out.println("insert successfully");
			} else
				System.out.println("not insert successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}

	@Override
	public void displayAllStudents() {
		try (Connection con = ConnectionProvider.getConnection();
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from student");) {
			while (rs.next()) {
				System.out.println(
						rs.getInt("studentId") + " " + rs.getString("studentName") + " " + rs.getInt("studentAge"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id1) {
		try (Connection con = ConnectionProvider.getConnection(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("DELETE FROM student WHERE studentId=" + id1 + "");
			if (count > 0) {
				System.out.println("delete successfully");
			} else
				System.out.println("not delete successfully");
			ResultSet rs = st.executeQuery("select * from student");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id1, int id, String name, int age) {
		try (Connection con = ConnectionProvider.getConnection(); Statement st = con.createStatement();) {
			int count = st.executeUpdate("UPDATE student SET studentName = '" + name + "',studentAge=" + age
					+ ",studentId =" + id + " WHERE studentId = " + id1 + "");
			if (count > 0) {
				System.out.println("update successfully");
			} else
				System.out.println("not update successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}