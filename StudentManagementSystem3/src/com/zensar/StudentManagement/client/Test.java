package com.zensar.StudentManagement.client;

import com.zensar.StudentManagement.entity.Student;
import com.zensar.StudentManagement.service.StudentService;
import com.zensar.StudentManagement.service.StudentServiceImpl;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		StudentService studentservice = new StudentServiceImpl();

		int studentId = 0;
		String studentName = null;
		int studentAge = 0;

		String enteredValue;
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
				Student students = new Student(studentId, studentName, studentAge);

				studentservice.insertStudent(students);
				System.out.println("Data inserted");
				break;
			case 2:
				Student[] allStudent = studentservice.displayStudent();
				for (Student data : allStudent) {
					if (data != null) {
						System.out.println(data);
					}
				}
				break;

			case 3: {
				System.out.println("enter id for delete");
				int id1 = scanner.nextInt();
				studentservice.deleteStudent(id1);
				break;
			}
			case 4: {
				System.out.println("enter id for update");
				int id1 = scanner.nextInt();
				studentservice.updateStudent(id1);

				break;
			}
			}
			System.out.println("Do you want to continue (y/n)");
			enteredValue = scanner.next();
		} while (enteredValue.equalsIgnoreCase("y"));
		System.out.println("Thank you for using Student Managment Application !!!!");
	}
}
