package com.zensar.StudentManagement.repository;

import java.util.Scanner;

import com.zensar.StudentManagement.entity.Student;

public class StudentRepositoryImpl implements StudentRepository {
	Student[] studentarray = new Student[10];
	int counter = 0;

	@Override
	public int insertStudent(Student students) {
		studentarray[counter++] = students;
		return 0;
	}

	@Override
	public Student[] displayStudent() {
		
		return studentarray;
		
	}

	@Override
	public int deleteStudent(int id1) {
		for (int j = 0; j < studentarray.length; j++) {
			int id2 = studentarray[j].getStudentId();
			if (id1 == id2) {
				studentarray[j].setStudentAge(0);
				studentarray[j].setStudentId(0);
				studentarray[j].setStudentName(null);
				System.out.println("data deleted");
				break;
			}
		}
		return 0;
	}

	@Override
	public int updateStudent(int id1) {
		Scanner scanner=new Scanner(System.in);
		for (int j=0;j<studentarray.length;j++){
			int id2=studentarray[j].getStudentId();
			if(id1==id2){
				System.out.println("enter id ,name, age");
				int id=scanner.nextInt();
				String name=scanner.next();
				int age=scanner.nextInt();
				studentarray[j].setStudentAge(age);
				studentarray[j].setStudentName(name);
				studentarray[j].setStudentId(id);
				System.out.println("update successfully");
				break;
			}
		}
		return 0;
	}
}
