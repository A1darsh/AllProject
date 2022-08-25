package com.zensar.login.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.login.dto.LoginDto;
import com.zensar.login.entity.Login;
import com.zensar.login.entity.Token;
import com.zensar.login.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	Token token = new Token();
	@Autowired
	LoginRepository loginRepository;

	@Autowired
	private ModelMapper modelMapper;

	// static List<Login> loginData = new ArrayList<Login>();
	@Override
	public Token loginUser(LoginDto loginDto) {
		if (loginDto.getUserName().equals("anand") && loginDto.getPassword().equals("anand123")) {
			Random random = new Random();

			int nextInt = random.nextInt(100);
			token.setId("auth-token");
			token.setTokenName("am222" + nextInt + "");

			return token;
		}
		return null;
	}

	@Override
	public boolean logOut(String token1) {
		if (token1.equals(token.getTokenName())) {
			token.setId(null);
			token.setTokenName(null);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public LoginDto registerUser(LoginDto loginDto) {
		Login login = modelMapper.map(loginDto, Login.class);
		Login login1 = loginRepository.save(login);
		return  modelMapper.map(login1, LoginDto.class);
		
	}

	@Override
	public List<LoginDto> getUser(String token1) {
		if (token1.equals(token.getTokenName())) {
			List<Login> login = loginRepository.findAll();
			List<LoginDto> loginDto = new ArrayList<>();
			for (Login l : login) {
				loginDto.add(modelMapper.map(l, LoginDto.class));
			}
			return loginDto;
		}
		return null;
	}
}
