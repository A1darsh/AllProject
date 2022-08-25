package com.zensar.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.zensar.entity")
@PropertySource(value = { "myProperties.properties", "address.property", })
public class DemoConfig {

	/*
	 * @Bean(value = "e2") public Employee getEmployee() { return new Employee(1,
	 * "pqr", 20, getAddress()); }
	 * 
	 * @Bean public Address getAddress() { return new Address("maha", "mumbai",
	 * 11234); }
	 */

}
