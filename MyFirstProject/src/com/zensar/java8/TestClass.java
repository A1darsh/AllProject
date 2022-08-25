package com.zensar.java8;

public class TestClass implements MyInterface,MyInterface2{

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void display() {
		MyInterface.super.display();
		MyInterface2.super.display();
	}
	
	

	public static void main(String[] args) {
		TestClass t=new TestClass();
		t.display();
		
		
		
	}
}
