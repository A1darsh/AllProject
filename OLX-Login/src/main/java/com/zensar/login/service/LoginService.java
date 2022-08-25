package com.zensar.login.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.zensar.login.entity.Token;
import com.zensar.login.dto.LoginDto;
import com.zensar.login.entity.Login;

public interface LoginService {

	public Token loginUser(LoginDto loginDto);
	public boolean logOut(String token);
	public LoginDto registerUser( LoginDto loginDto);
	public List<LoginDto> getUser(String token );
}
