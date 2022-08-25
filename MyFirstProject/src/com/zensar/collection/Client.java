package com.zensar.collection;

import com.zensar.entity.Employee;

import java.util.*;

public class Client{

	public static void main(String[] args) {
		
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(1,"adf",3000));
		employees.add(new Employee(2,"bsdf",30293));
		employees.add(new Employee(3,"cam",300840));
		
		Collections.sort(employees,new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getEmployeeName().compareTo(o2.getEmployeeName());
			}
		});
		System.out.println(employees);
		System.out.println("done");
		
		/*TreeSet  map = new TreeSet();
		 map.add("one");
		 map.add("two");   
		 map.add("three");   
		 map.add("one");
		 map.add("four");
		 
		 Iterator it = map.iterator();
		 while (it.hasNext() ) {
		 System.out.print( it.next() + " " );
		 }*/
		
		
		
		
		
		
		//Set keys=map.keySet();
		//for(Object i: keys) {
		//System.out.println(i +" "+map.get(i));
		//}
		
		
		
		
		
		
		
		/*Employee emp3 = new Employee(4, "retttr", 4000);
		Employee emp2 = new Employee(2, "retr", 40000);
		Employee emp1 = new Employee(1, "asdf", 30000);
		//System.out.println(emp1.hashCode());
		Employee emp4 = new Employee(1, "asdf", 30000);
		//System.out.println(emp4.hashCode());
		Set set = new HashSet();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);

		System.out.println(set);*/

		// List al=new ArrayList();
		//// al.add(emp1);
		// al.add(emp2);
		// al.add(emp3);

		// Collections.sort(al,new SalaryComparator());
		// System.out.println(al);

		// Collections.reverse(al);
		// System.out.println(al);

		/*
		 * Employee emp3=new Employee(4,"retttr",4000); Employee emp2=new
		 * Employee(2,"retr",40000); Employee emp1=new Employee(1,"asdf",30000);
		 * 
		 * 
		 * TreeSet set=new TreeSet(new NameComparator()); set.add(emp1); set.add(emp2);
		 * set.add(emp3);
		 * 
		 * 
		 * System.out.println(set); for(Object a: set) { System.out.println(a); }
		 */

		/*
		 * Set arr = new HashSet(); arr.add(1); arr.add(2); arr.add(3); arr.add(4);
		 * arr.add("hon"); System.out.println(arr);
		 */
		/*
		 * ListIterator lis = arr.listIterator(); System.out.println("forward--------");
		 * while (lis.hasNext()) { int i = (int) lis.next(); System.out.println(i); }
		 * 
		 * System.out.println("backword--------"); while (lis.hasPrevious()) { int i =
		 * (int) lis.previous(); System.out.println(i); }
		 */

		// Iterator itr=arr.iterator(); while(itr.hasNext()) {
		// .out.println(itr.next()); }
		//
		// for (int i = 0; i < arr.size(); i++) {
		/// System.out.println(arr);

		// }
		/*
		 * 
		 * 
		 * 
		 * Stack stack=new Stack(); /* LinkedList l = new LinkedList();
		 * 
		 * l.addFirst("asdf"); l.add("sam"); l.add("tony"); l.add("tony");
		 * System.out.println(l);
		 */

		// Vector v=new Vector();

		// v.add("ram");
		// v.add(1);
		// v.add(2);
		// v.add(3);
		// v.add(4);

		// System.out.println(v);

		// System.out.println(v.size());
		// System.out.println(v.capacity());

		/// Iterator it=v.iterator();
		// while(it.hasNext()) {
		// System.out.println(it.next());

		// }

		/*
		 * ArrayList cities = new ArrayList(); cities.add("mumbai");
		 * 
		 * cities.add("up"); cities.add("mp");
		 * 
		 * ArrayList names = new ArrayList(cities); names.add("ram");
		 * names.add("mohan"); names.add(12); names.add(1, "rohit"); names.add("rahul");
		 * 
		 * names.remove("mohan"); System.out.println(names.contains("ram"));
		 * 
		 * System.out.println(names); System.out.println(names.get(0)); names.remove(1);
		 * System.out.println(names); names.set(2, "deepanshu");
		 * System.out.println(names);
		 * 
		 * System.out.println(names.contains(12)); System.out.println(names.size());
		 */

		/*
		 * for (int i = 0; i < names.size(); i++) { System.out.println(names.get(i)); }
		 * 
		 * for (Object name : names) { System.out.println(name); }
		 * 
		 * Iterator nameIterator = names.iterator();
		 * 
		 * while (nameIterator.hasNext()) { System.out.println(nameIterator.next()); }
		 */

	}
}
