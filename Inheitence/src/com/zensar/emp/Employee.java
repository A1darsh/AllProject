package com.zensar.emp;

public class Employee {

	private int id;
	private int age;
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int id, int age, int salary) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
	public int totalSalary() {
		return salary;
	}
	
	
}
