package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;

public interface StudentService {
	int acceptStudent(int studentId, String studentName, int StudentAge);

	Student[] displayAllStudents();
}
