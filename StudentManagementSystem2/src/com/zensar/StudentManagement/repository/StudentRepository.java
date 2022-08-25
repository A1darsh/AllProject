package com.zensar.StudentManagement.repository;

import com.zensar.StudentManagement.entity.Student;

public interface StudentRepository {
	int insertStudent(int id, String name, int age);
	void displayAllStudents();
	void delete(int id1);
	void update(int id1,int id,String Name,int Age);
	
	
}
