package com.zensar.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name =sc.next();
		
		try {
			fos=new FileOutputStream("pqr.txt");
			byte[]bytes	=name.getBytes();
			fos.write(bytes);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
