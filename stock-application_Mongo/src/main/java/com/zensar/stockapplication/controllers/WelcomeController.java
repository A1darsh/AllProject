package com.zensar.stockapplication.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	//http://localhost:4040/test
	@RequestMapping(value="/test",method= {RequestMethod.GET,RequestMethod.POST})
	public void test() {
		System.out.println("i am inside the welcome controller method");
	}
}
