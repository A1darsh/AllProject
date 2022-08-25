package com.zensar.StudentManagement.client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.zensar.StudentManagement.entity.*;
import com.zensar.StudentManagement.repository.InsertStudentToDatabase;
import com.zensar.StudentManagement.service.StudentService;
import com.zensar.StudentManagement.service.StudentServiceImpl;

public class Test {

	public static void main(String[] args) throws SQLException {
		
		
		StudentService studentService=new StudentServiceImpl();
		
		
		//Student student1[]=new Student[10];
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
				
				studentService.insertStudent(studentId, studentName, studentAge);
				//InsertStudentToDatabase.InsertStudentToDB(studentId, studentName, studentAge);
				
				
				
				
				break;
			case 2:
				studentService.displayAllStudents();
				break;
			case 3: 
				System.out.println("enter id for delete");
				int id1 = scanner.nextInt();
				studentService.delete(id1);
				break;
			case 4:
				System.out.println("enter id for update");
				int id11 = scanner.nextInt();
				
				String Name=null;;
				int Age=0;

				int id=0;
				studentService.update(id11, id, Name, Age);
			    break;
			}	
			System.out.println("Do you want to continue (y/n)");
			enteredValue = scanner.next();
		} while (enteredValue.equalsIgnoreCase("y"));

		System.out.println("Thank you for using Student Managment Application !!!!");

	}
}



