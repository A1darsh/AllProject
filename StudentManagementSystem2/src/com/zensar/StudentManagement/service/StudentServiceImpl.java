package com.zensar.StudentManagement.service;

import com.zensar.StudentManagement.entity.Student;
import com.zensar.StudentManagement.repository.StudentCollectionRepository;
import com.zensar.StudentManagement.repository.StudentRepository;
import com.zensar.StudentManagement.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService {
	StudentRepository studentRepository=new StudentCollectionRepository();
	
	@Override
	public int insertStudent(int Id, String Name, int Age) {
		studentRepository.insertStudent( Id,  Name, Age);
		return 0;
	}

	@Override
	public void displayAllStudents() {
		studentRepository.displayAllStudents();
	}

	@Override
	public void delete(int id1) {
		studentRepository.delete(id1);
		
	}

	@Override
	public void update(int id1,int id,String Name,int Age) {
		studentRepository.update(id1, id, Name, Age);
		
	}

	

	

}
