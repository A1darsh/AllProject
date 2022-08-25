package com.zensar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.zensar.manytoone.entity.Company;
import com.zensar.manytoone.entity.Employee;
import com.zensar.manytoone.repository.CompanyRepository;
import com.zensar.manytoone.repository.EmployeeRepository;

@SpringBootApplication
public class ManyToOneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ManyToOneApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
        Company company=null;
		
		List<Employee> list=null;
		
		list=new ArrayList<>();
		
		company=Company.builder().name("zensar technology").build();
		list.add(Employee.builder().name("govind").salary(5633.3).company(company).build());
		list.add(Employee.builder().name("rajesh").salary(5543.3).company(company).build());
		list.add(Employee.builder().name("rohit").salary(3432.3).company(company).build());
		
		
		employeeRepository.saveAll(list);
	}

}
