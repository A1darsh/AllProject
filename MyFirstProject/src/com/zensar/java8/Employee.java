package com.zensar.java8;

import java.io.Serializable;
import java.util.List;

public class Employee extends Object implements Comparable{
	private int employeeId;
	private String employeeName;
	private int employeeSalary;
	private List<Address> address;
	//private static Employee employee;
	//private static int counter;
    
	public Employee() {
		super();
		
	}

	public Employee(int employeeId, String employeeName, int employeeSalary,List<Address> address) {
		super();
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	    this.address=address;
	}
	/*public static Employee getInstence(){
		if (counter==0){
			return employee=new Employee();
			}
		else{
			return employee;	
			}
		
	}*/

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + ", address=" + address + "]";
	}

	public int calculateSalary() {
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp2=(Employee)o;
		if (this.getEmployeeSalary()>emp2.getEmployeeSalary()) {
			return 1;
		}
		if (this.getEmployeeSalary()<emp2.getEmployeeSalary()) {
			return -1;
		}
		if (this.getEmployeeSalary()==emp2.getEmployeeSalary()) {
			return 1;
		}
		return employeeSalary;
		
	}

	@Override
	public int hashCode() {
		System.out.println("hash code");
		final int prime = 31;
		int result = 1;
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + employeeSalary;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (employeeSalary != other.employeeSalary)
			return false;
		return true;
	}

	/*public boolean equals(Object obj) {
		Employee e2 = (Employee) obj;
		if (this.employeeId == e2.getEmployeeId()
				&& this.employeeName == e2.getEmployeeName()
				&& this.employeeSalary == e2.getEmployeeSalary()) {
			return true;
		} else {
			return false;
		}*/

	//}
	public  void printEmployee(String name) {
		System.out.println(name);
	}

}
