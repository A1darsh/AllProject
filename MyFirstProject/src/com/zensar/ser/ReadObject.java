package com.zensar.ser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
//import java.io.ObjectInputStream;
import java.io.ObjectInputStream;

import com.zensar.entity.Employee;

public class ReadObject {

	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		ObjectInput ois=null;
		ois=new ObjectInputStream(new FileInputStream("abc.txt"));
		Employee e=(Employee)ois.readObject();
		ois.readObject();
		

	}

}
