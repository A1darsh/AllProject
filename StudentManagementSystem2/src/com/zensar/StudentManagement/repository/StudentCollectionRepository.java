package com.zensar.StudentManagement.repository;

import java.util.HashMap;
import java.util.Map;

import com.zensar.StudentManagement.entity.Student;

public class StudentCollectionRepository implements StudentRepository{

	
	Map<Integer, Student> studentMap=new HashMap<>();
	@Override
	public int insertStudent(int id, String name, int age)
	{
		Student student=new Student(id,name,age);
		studentMap.put(student.getStudentId(),student);
		//studentMap.put(student.getStudentName(), student);
		studentMap.put(student.getStudentAge(),student);
		return id;
	}

	@Override
	public void displayAllStudents() {
		for (Map.Entry entry : studentMap.entrySet())
			System.out.println( entry.getKey() +" " + entry.getValue());

			}

	@Override
	public void delete(int id1) {
		studentMap.remove(id1, studentMap.get(id1));
		
	}

	@Override
	public void update(int id1, int id, String Name, int Age) {
		Student st=new Student(id,Name,Age);
		if(studentMap.containsKey(id1)) {
		studentMap.replace(id1,st );
		System.out.println("update succesfully");
		}else
		System.out.println("you have enter wrong value");

		}


		
	}

	