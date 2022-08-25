package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;

public interface StudentService {
	public int insertStudent(Student students);
	Student[] displayStudent();
	public int deleteStudent(int id1);
	public int updateStudent(int id1);
}
