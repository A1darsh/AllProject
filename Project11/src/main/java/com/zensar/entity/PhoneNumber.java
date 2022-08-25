package com.zensar.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class PhoneNumber {
	
	@Value("${num}")
	private List<String> num;

	public List<String> getNum() {
		return num;
	}

	public void setNum(List<String> num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "PhoneNumber [num=" + num + "]";
	}

	

}
