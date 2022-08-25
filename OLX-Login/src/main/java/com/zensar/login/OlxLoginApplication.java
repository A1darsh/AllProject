package com.zensar.login;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.zensar.login.entity.Login;

@SpringBootApplication
public class OlxLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(OlxLoginApplication.class, args);
	
		Login login=new Login();
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
}
