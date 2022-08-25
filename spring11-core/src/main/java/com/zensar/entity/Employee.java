package com.zensar.entity;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="e1")
public class Employee {

	@Value("${eid}")
	private int employeeId;
	@Value("${ename}")
	private String employeeName;
    //private List<String> employeeName;
	@Value("${eage}")
	private int employeeAge;
	@Autowired
	private Address address;

	public Employee(Address addrass) {
		super();
		System.out.println("public Employee(Address address)");
		this.address = addrass;
	}

	public Employee(int employeeId, String employeeName, int employeeAge, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	
	public void setAddrass(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", addrass=" + address + "]";
	}

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
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

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	@PostConstruct
	public void myPropertiesSet() throws Exception {
		System.out.println("afterProset");

	}

	@PreDestroy
	public void myDestroy() {
		System.out.println("in destroy");
	}
}