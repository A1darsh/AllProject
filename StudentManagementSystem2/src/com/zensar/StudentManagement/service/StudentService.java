package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;

public interface StudentService {
	int insertStudent(int Id ,String Name,int Age );

	void displayAllStudents();

	void delete(int id1);

	void update(int id1,int id,String Name,int Age);

	
}
