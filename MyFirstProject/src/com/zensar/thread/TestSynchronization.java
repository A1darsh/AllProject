package com.zensar.thread;

public class TestSynchronization {

	public static void main(String[] args) {
		
		Greeting greeting=new Greeting();
		MyThread ramThread=new MyThread(greeting,"ram");
		MyThread seetaThread=new MyThread(greeting,"seeta");
		
		Thread t1=new Thread(ramThread);
		Thread t2=new Thread(seetaThread);
		t1.start();
		t2.start();
	
	}

}
