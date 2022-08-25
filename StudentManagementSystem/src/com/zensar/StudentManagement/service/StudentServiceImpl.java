package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;
import com.zensar.StudentManagement.repository.StudentRepository;
import com.zensar.StudentManagement.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepository=new StudentRepositoryImpl();
	
	@Override
	public int acceptStudent(int studentId, String studentName, int StudentAge) {
		Student newStudent=new Student(studentId,studentName,StudentAge);
		
		//studentRepository.insertStudent(int id,String name,int age);
		
		return studentId;
	}

	@Override
	public Student[] displayAllStudents() {
	
		return studentRepository.displayAllStudents();
	}

}
