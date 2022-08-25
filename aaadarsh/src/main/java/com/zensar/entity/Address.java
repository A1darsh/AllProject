package com.zensar.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("${pincode}")
	private int pincode;
	@Value("${city}")
	private String city;
	public Address(int pincode, String city) {
		super();
		this.pincode = pincode;
		this.city = city;
	}
	public Address() {
		super();
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + "]";
	}

	
}
