package com.zensar.StudentManagement.repository;

import com.zensar.StudentManagement.entity.Student;

public interface StudentRepository {
	int insertStudent(int id,String name ,int age);
	Student[] displayAllStudents();
	
}
