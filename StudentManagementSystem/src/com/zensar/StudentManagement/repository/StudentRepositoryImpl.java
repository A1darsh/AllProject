package com.zensar.StudentManagement.repository;

import com.zensar.StudentManagement.entity.Student;

public class StudentRepositoryImpl implements StudentRepository {
	Student[] student1 = new Student[5];
	int counter=0;
	@Override
	public int insertStudent(int id,String name ,int age) {
		Student student=new Student(id, name , age);
		student1[counter++]=student;
		return id;
	}
	/*
	 * @Override public Student[] displayAllStudents() { // TODO Auto-generated
	 * method stub return null; }
	 */
	@Override
	public Student[] displayAllStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	//@Override
	//public Student[] displayAllStudents() {
		
		//return s;
	}

	


