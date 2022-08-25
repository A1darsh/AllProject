package com.zensar;

public class Address {
	private String city;
	private String post;

	public Address() {
		super();
	}

	public Address(String city, String post) {
		super();
		this.city = city;
		this.post = post;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", post=" + post + "]";
	}

}
