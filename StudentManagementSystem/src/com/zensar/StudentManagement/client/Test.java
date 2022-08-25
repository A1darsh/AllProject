package com.zensar.StudentManagement.client;

import java.util.Scanner;

import com.zensar.StudentManagement.entity.*;
import com.zensar.StudentManagement.service.StudentService;
import com.zensar.StudentManagement.service.StudentServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		StudentService studentService=new StudentServiceImpl();
		
		//StudentServiceImpl studentServiceImpl= new StudentServiceImpl();
		
		Student student1[]=new Student[10];
		int studentId = 0, studentAge = 0; int temp=0;
		String studentName = null, enteredValue = null; int counter=0;
		do {
			System.out.println("Welcome to Student Managment Application");

			System.out.println(" 1 : Inserting Student");

			System.out.println(" 2 : Display all students");

			System.out.println("3 : deleting the student");
			System.out.println("4 : updating the student");

			System.out.println("Please enter your choice");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				System.out.println("Please enter student Id");
				studentId = scanner.nextInt();
				System.out.println("Please enter student Name");
				studentName = scanner.next();
				System.out.println("Please enter student Age");
				studentAge = scanner.nextInt();
				Student student2=new Student(studentId,studentName,studentAge);
				
				student1[counter++]=student2;
				

				System.out.println("student resisterd successfuly with suudent id");

				break;
			case 2:
				System.out.println("printed value");
				for (Student student: student1){
					if(student!=null){
						System.out.println(student);
					}
				}
				break;
			case 3: {
				System.out.println("enter id for delete");
				int id1 = scanner.nextInt();
				
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
				break;
			}
			case 4: {
				System.out.println("enter id for update");
				int id11 = scanner.nextInt();
	
				for (int j=0;j<student1.length;j++){
					int val=student1[j].getStudentId();
					if(id11==val){
						System.out.println("enter id ,name, age");
						int id=scanner.nextInt();
						String name=scanner.next();
						int age=scanner.nextInt();
						student1[j].setStudentAge(age);
						student1[j].setStudentName(name);
						student1[j].setStudentId(id);
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
			break;
			}
			}	
			System.out.println("Do you want to continue (y/n)");
			enteredValue = scanner.next();
		} while (enteredValue.equalsIgnoreCase("y"));

		System.out.println("Thank you for using Student Managment Application !!!!");

	}
}



