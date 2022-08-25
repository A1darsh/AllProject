package com.zensar.collection;

import java.util.Comparator;

import com.zensar.entity.Employee;

public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee emp1=(Employee)o1;
		Employee emp2=(Employee)o2;
		if (emp1.getEmployeeSalary()>emp2.getEmployeeSalary()) {
			return 1;
		}
		if (emp1.getEmployeeSalary()<emp2.getEmployeeSalary()) {
			return -1;
		}
		if (emp1.getEmployeeSalary()==emp2.getEmployeeSalary()) {
			return 1;
		}
		return 12;
	}

	

}
