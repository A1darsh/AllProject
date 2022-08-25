package com.zensar.ser;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.zensar.entity.Employee;

public class WriteObject {

	public static void main(String[] args) {
		Employee employee=new Employee(1,"asdf",1200);
		
		ObjectOutputStream oos=null;
		try {
			oos=new ObjectOutputStream(new FileOutputStream("abc.txt"));
			
			oos.writeObject(employee);
			System.out.println("object written successfully");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(employee);
	}

}
