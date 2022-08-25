package com.zensar.StudentManagement.repository;

import java.util.Scanner;

import com.zensar.StudentManagement.entity.Student;

public class StudentRepositoryImpl implements StudentRepository {
	Student[] student1 = new Student[5];
	int counter=0; int temp=0;
	@Override
	public int insertStudent(int id, String name, int age) {
		Student student=new Student(id, name , age);
		student1[counter++]=student;
		return 0;
	}

	@Override
	public void displayAllStudents() {
		for (Student students: student1){
			if(students!=null){
			System.out.println(students);
			}
		}
		
	}

	@Override
	public void delete(int id1) {
	    for (int j=0;j<student1.length;j++){
	    	int id2=student1[j].getStudentId();
	         System.out.println(id2);
	    	
	    	if(id1==id2){
	    		student1[j].setStudentAge(0);
	    		student1[j].setStudentId(0);
	    		student1[j].setStudentName(null);
	    		temp=2;
	    		j=100;
	    }else{
	    	temp=0;
			}
	    }if(temp==0){
	    	System.out.println("student not deleted");}
	    else{
	    	System.out.println("student deleted");
	    }
		
	}

	@Override
	public void update(int id1,int id,String Name,int Age) {
		Scanner scanner=new Scanner(System.in);
		for (int j=0;j<student1.length;j++){
			int val=student1[j].getStudentId();
			if(id1==val){
				System.out.println("enter id ,name, age");
				int id2=scanner.nextInt();
				String name=scanner.next();
				int age=scanner.nextInt();
				student1[j].setStudentAge(age);
				student1[j].setStudentName(name);
				student1[j].setStudentId(id2);
				temp=2;
				j=100;
			}else{
				temp=0;	
			}
			if (temp==2){
				System.out.println("value updated");
			}
			else{
				System.out.println("value not updated");
			}
			
			
			
	}
		
	}

	

}
