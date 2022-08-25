package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;
import com.zensar.StudentManagement.repository.StudentRepository;
import com.zensar.StudentManagement.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	StudentRepository studentrepository=new StudentRepositoryImpl();
	@Override
	public int insertStudent(Student students) {
		studentrepository.insertStudent(students);
		return 0;
	}
	@Override
	public Student[] displayStudent() {
		return studentrepository.displayStudent(); 
	}
	@Override
	public int deleteStudent(int id1) {
		studentrepository.deleteStudent(id1);
		return 0;
	}
	@Override
	public int updateStudent(int id1) {
		studentrepository.updateStudent(id1);
		return 0;
	}	
}
