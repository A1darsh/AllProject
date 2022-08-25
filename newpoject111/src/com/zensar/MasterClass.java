package com.zensar;

import java.util.ArrayList;
import java.util.List;
import com.zensar.*;
public class MasterClass {
	
	public static void main(String[] args) {
		
		List<Employee> masterEmployee=new ArrayList<>();
		
		masterEmployee.add(new Employee(1,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(2,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(3,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(4,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(5,"adarsh",1200,"se"));
		
		masterEmployee.add(new Employee(6,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(7,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(8,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(9,"adarsh",1200,"se"));
		masterEmployee.add(new Employee(10,"adarsh",1200,"se"));
		
		
		List<Employee> listEmps=new ArrayList<>();
		listEmps.add(new Employee(3,"adarsh",1200,null));
		listEmps.add(new Employee(4,"adarsh",1200,null));
		listEmps.add(new Employee(5,"adarsh",1200,null));
		listEmps.add(new Employee(99,"ad",12,"as"));
		listEmps.add(new Employee(43,"ada",120,"lkj"));
		listEmps.add(new Employee(51,"adar",1211,"kuo"));
		
		
		for(Employee emp : masterEmployee) {
			for (Employee emp1 :listEmps) {
				if(emp.getEmpId()==emp1.getEmpId()) {
					emp1.setDesignation(emp.getDesignation());
				}
			}
		}
		
		
		
		System.out.println(listEmps);
		System.out.println(masterEmployee);
	}
	
	
	
}
