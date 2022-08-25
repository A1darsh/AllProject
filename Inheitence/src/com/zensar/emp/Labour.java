package com.zensar.emp;

public class Labour extends Employee {

	private int overtime;

	public Labour() {
		super();
	}

	public Labour(int id, int age, int salary, int overtime) {
		super(id, age, salary);
		this.overtime = overtime;
	}

	@Override
	public String toString() {
		return "Labour [overtime=" + overtime + "]";
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	@Override
	public int totalSalary() {
		
		return overtime+super.totalSalary();
	}

	
}
