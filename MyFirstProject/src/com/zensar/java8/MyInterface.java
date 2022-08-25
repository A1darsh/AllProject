package com.zensar.java8;

public interface MyInterface {
    public double area();
	public default void display() {
		System.out.println("my interface ");
	}
	public default int add(int a,int b) {
		
		return a+b;
	}
}
