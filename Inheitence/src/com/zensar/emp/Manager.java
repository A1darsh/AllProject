package com.zensar.emp;

public class Manager extends Employee {
 
	
	private int incentive;
	
	public Manager() {
		super();
	}

	public Manager(int id, int age, int salary, int incentive) {
		super(id, age, salary);
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager [incentive=" + incentive + "]";
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	@Override
	public int totalSalary() {
		
		return incentive+super.totalSalary();
	}
}
