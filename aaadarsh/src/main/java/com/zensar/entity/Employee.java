package com.zensar.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component(value = "emp1")
public class Employee {
	@Value("${id}")
	private int id;
	@Value("${name}")
	private String name;
	@Value("${salary}")
	private int salary;
	
	@Autowired
	private Address address;
	@Autowired
	private Emp emp;
	
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Employee(int id, String name, int salary, Address address, Emp emp) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
		this.emp = emp;
	}
	public Employee() {
		super();
	}
	public Employee(int id, String name, int salary, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", emp=" + emp
				+ "]";
	}
	
	
	
}
