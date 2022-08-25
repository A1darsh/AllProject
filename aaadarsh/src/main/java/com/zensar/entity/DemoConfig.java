package com.zensar.entity;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.zensar.entity")
@PropertySource(value="myProperties.properties")
public class DemoConfig {
	/*
	 * //@postMapping("/stock/user/login") public String loginUser(String str) {
	 * 
	 * String auth_token="sr123"; return auth_token; }
	 */
}


