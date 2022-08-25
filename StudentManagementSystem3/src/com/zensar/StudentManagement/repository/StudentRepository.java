package com.zensar.StudentManagement.repository;

import com.zensar.StudentManagement.entity.Student;

public interface StudentRepository
{
	public int insertStudent(Student students);
	Student[] displayStudent();
	public int deleteStudent(int id1);
	public int updateStudent(int id1);
	
	
}
