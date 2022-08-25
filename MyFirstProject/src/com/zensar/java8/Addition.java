package com.zensar.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Addition {

	
	public int add(int a,int b,int c);
}

/*class AdditionImpl implements Addition{

	@Override
	public void add() {
		System.out.println("adding");
	}
	
}*/

class TestAdd{
	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>();
		names.add("ram");
		names.add("rahul");
		names.add("ragini");
		names.add("satyam");
		
		Employee e=new Employee();
		/* for (String n:names)
		 {
			 System.out.println(n);
		 }*/
		//names.forEach((String name)-> System.out.println(name));
		
		//names.forEach((name)-> System.out.println(name));
		
		//names.forEach(Employee::printEmployee);     for that we have to make printEmployee static
		
		names.forEach(e::printEmployee); 
		
		
		
		
		
		
		
		
		
		/*Addition addition=new Addition() {
			
			@Override
			public void add() {
				System.out.println("addition in inner");
				
			}
		};
		addition.add();*/
		/*Addition addition=(int a,int b,int c)->{
			System.out.println("the addition is "+(a+b+c));
		};
		addition.add(20,40,55);*/
		//Addition addition=(a, b, c)-> (a+b+c);
		//System.out.println(addition.add(20,40,55));
	
		/*Predicate<Integer> p=(i)->{
			if (i%2==0) {
				return true;
			}else {
				return false;
			}
		};*/
		
		//Predicate<Integer> p1=(input)-> input%2==0;
		
		//System.out.println(p1.test(9));
	
		//Consumer<String > c=(String name) -> System.out.println(name);
		//c.accept("ram");
	
		//Supplier<Integer> s=()-> 88;
		
	   // System.out.println(s.get());
	  /*Function<Integer,String> f=(k)->{
		  return "hello";
	  };
		System.out.println(f.apply(5));*/
		
		
	}
}