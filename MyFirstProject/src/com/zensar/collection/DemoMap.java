package com.zensar.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.zensar.entity.Employee;

public class DemoMap {

	public static void main(String[] args) {
		// Addition a=new Addition(3);
		// System.out.println(a.add());
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		//al.add("str");
		
		Iterator<Integer> iterator = al.iterator();
		while (iterator.hasNext()) {
			Integer i = iterator.next();
			System.out.println(i);
		}

		// Employee e1 = new Employee(1, "ram", 5000);
		// Employee e2 = new Employee(3, "rohan", 50230);
		// Employee e3 = new Employee(2, "raj", 51200);

		// Properties p=new Properties();
		// p.setProperty("name", "adarsh");
		/// p.setProperty("age", "30");
		// p.setProperty("mobile", "12345678");

		// System.out.println(p.get("mobile"));

		/*
		 * Hashtable htable=new Hashtable(); htable.put(e1.getEmployeeId(), e1);
		 * htable.put(e2.getEmployeeId(), e2); htable.put(e3.getEmployeeId(), e3);
		 * 
		 * System.out.println(htable);
		 */

		/*
		 * Map <Integer,Employee> map = new HashMap<>();
		 * 
		 * map.put(e1.getEmployeeId(), e1); map.put(e2.getEmployeeId(), e2);
		 * map.put(e3.getEmployeeId(), e3);
		 * 
		 * for (Map.Entry set : map.entrySet()) {
		 * System.out.println(set.getKey()+" ..."+map.get(set.getKey())); }
		 */

		// System.out.println(map);

		/*
		 * Set keys=map.keySet(); Iterator iterator=keys.iterator();
		 * while(iterator.hasNext()) { Integer i=(Integer)iterator.next();
		 * System.out.println(map.get(i)); }
		 */

	}

}
