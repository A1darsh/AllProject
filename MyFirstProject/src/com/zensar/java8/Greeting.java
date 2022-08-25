package com.zensar.java8;

public interface Greeting {

	public void greet(String name);        //functional interface because of only one abstract method
}


/*class Greetingimpl implements Greeting{

	@Override
	public void greet(String name) {
		System.out.println("good morning"+" "+name);
	}
	
}*/

class Test{
	public static void main(String[] args) {
		/*Greeting greeting =new Greeting() {
			
			@Override
			public void greet(String name) {
				System.out.println("hello"+" "+name);
			}
		};
		greeting.greet("adarsh");*/
		
		Greeting gretting=(String name)->{
			System.out.println("hello"+ " "+name);
		};
		gretting.greet("rahul");
	}
}