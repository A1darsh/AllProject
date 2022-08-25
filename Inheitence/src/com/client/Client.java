package com.client;

import com.zensar.emp.Employee;
import com.zensar.emp.Labour;
import com.zensar.emp.Manager;

public class Client {

	public static void main(String[] args) {

		Employee employee=new Employee(1,23,30000);

		//System.out.println(employee.totalSalary());
		Employee employee1=new Manager(1,23,30000,5000);
		System.out.println("salary of manager is :"+employee1.totalSalary());
		Employee employee2=new Labour(1,23,30000,2000);
		System.out.println("salary of labour is :"+employee2.totalSalary());
	}

}
