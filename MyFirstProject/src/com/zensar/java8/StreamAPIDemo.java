package com.zensar.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		String name=null;
		
		Optional<String> of=Optional.ofNullable(name);
		
		of.ifPresent(e -> System.out.println(e.toUpperCase()));
		
		of.orElseThrow(()->{
			return new RuntimeException("Name not found");
		});
		
		
		
		
//		List<String> names=Arrays.asList("abc","Abc","PQr","Bcd");
//		
//		System.out.println(names.stream().filter(name -> {
//			System.out.println("Hi");
//			return name.startsWith("A");
//		}).count());
//		
		
		
		
		//List<String> names=new ArrayList<>();

//		names.add("Virat");
//		names.add("Rohit");
//		names.add("Mahi");
//		names.add("Ravindra");
//		names.add("Sachin");
//       
		/*List<String> namesStartWithR=new ArrayList<String>();
		
		for (String n:names) {
			if(n.startsWith("R")) {
				namesStartWithR.add(n);
			}
		}
		System.out.println(namesStartWithR);
	
		*
		*/
		
		
	//names.stream().filter(n -> n.startsWith("R")).
	//forEach(n ->System.out.println(n));
	
		//List<String> namesWithR=names.stream().filter(name ->name.startsWith("R")).collect(Collectors.toList());
	//	System.out.println(namesWithR);
	
//		Stream<String> namesStream  =names.stream();
//		namesStream.forEach(c -> System.out.println(c));

		
		//names.stream().forEach(c -> System.out.println(c));
//	
		//int []a= {1,2,3,4,5};
//		String[] names1= {"a","b","c"};
//		 
//		Stream<String> stream=Arrays.stream(names1);
//		stream.forEach(t -> System.out.println(t));
//		
//		IntStream stream=Arrays.stream(a);
//		stream.forEach(i -> System.out.println(i));
//		
		//IntStream.iterate(1, n ->n+1).limit(10).forEach(i -> System.out.println(i));
	
		//int []a= {1,2,3,4,5,8,66};

//		int min=a[0];
//		for (int i=1;i<a.length;i++) {
//			if (a[i]<min) {
//				min=a[i];
//			}
//		}
//		System.out.println(min);
//	
//		 System.out.println("assending order");
//	     IntStream stream1=Arrays.stream(a);
//	     stream1.sorted().forEach(c -> System.out.println(c));
//	     
//	     System.out.println("decending order");
//	     IntStream stream2=Arrays.stream(a);
//	     List<Integer> collect=stream2.boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//	     System.out.println(collect);
//	     
	     
	     //System.out.println(stream1.average());
	
//	     List<Employee> employees= new ArrayList<>();
//	     
//	     employees.add(new Employee(1002,"ram",10000,Arrays.asList(new Address("up","lucknow",226028))));
//	     employees.add(new Employee(1003,"rohan",10002,Arrays.asList(new Address("mp","lu",226021))));
//	     employees.add(new Employee(1004,"adarsh",100003,Arrays.asList(new Address("uttrakhand","luck",226022))));
//	     employees.add(new Employee(1005,"rajeev",10004,Arrays.asList(new Address("rajasthan","luckno",226023))));
		     
//		  Comparator<Employee> empComparator= (Employee e1,Employee e2)->{
//			  return e1.getEmployeeName().compareTo(e2.getEmployeeName());
//		  };
//		     
//		   Collections.sort(employees,(Employee e1,Employee e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName())  );
//		   System.out.println(employees);
		 
		   
//		   Collections.sort(employees,Comparator.comparing(Employee::getEmployeeSalary));
//	       System.out.println(employees);
//	       System.out.println("reverse");
//		   Collections.sort(employees,Comparator.comparing(Employee::getEmployeeSalary).reversed());
//	       System.out.println(employees);
//	
	
	     //employees.stream().filter(e -> e.getEmployeeId()>1002).forEach(e -> System.out.println(e));
	
	     
	    // employees.stream().filter(e -> e.getEmployeeId()>1002).forEach(System.out::println);
	 	
//	     List<String> names=Arrays.asList("ram","mohan","krishna");
//	     
//	     List<String> namesInUpparCase= names.stream().map(name -> name.toUpperCase() ).collect(Collectors.toList());
//	     
//	     System.out.println(namesInUpparCase);

//	     List<Integer> salary= employees.stream().map(e -> e.getEmployeeSalary()+1000 ).collect(Collectors.toList());
//         System.out.println(salary);

	
	     //System.out.println(employees);
	    
//	     List<String > a=Arrays.asList("ram","mohan","rajesh");
//
//	     List<String > b=Arrays.asList("adarsh","satyam","rishabh");
//
//	     List<String > c=Arrays.asList("prince","tyagi","subham");
//	     
//		List<List<String>> alpha=new ArrayList<List<String>>();
//		
//	     alpha.add(a);
//	     alpha.add(b);
//	     alpha.add(c);
//	     
//	     List<String> collect=alpha.stream().flatMap(element -> element.stream()).collect(Collectors.toList());
//	     System.out.println(collect);
	
	}
}
