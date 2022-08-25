package com.zensar.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.login.entity.Token;
import com.zensar.login.dto.LoginDto;
import com.zensar.login.entity.Login;
import com.zensar.login.service.LoginService;

@RestController
@RequestMapping(produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})

public class LoginController {

	@Autowired
	private LoginService loginService;
	/*
	 * static List<Login> user1 = new ArrayList<Login>(); static { //user1.add(new
	 * Login(1,"anand","kulkarni","anand","anand123","anand@gmail.com",12345)); }
	 */

	@PostMapping(value="/user/authenticate")
	public Token loginUser(@RequestBody LoginDto loginDto) {
		return loginService.loginUser(loginDto);
	}

	@DeleteMapping("/user/logout")
	public boolean logOut(@RequestHeader("auth-token") String token) {
		return loginService.logOut(token);
	}

	@PostMapping(value="/user")
	public LoginDto registerUser(@RequestBody LoginDto loginDto){
		return loginService.registerUser(loginDto);
	}

	@GetMapping(value="/user")
	public List<LoginDto> getUser(@RequestHeader("auth-token") String token ){
		return loginService.getUser(token);
	}

}











