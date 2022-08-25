package com.zensar.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {
		FileReader reader=null;
		

		try {
			reader=new FileReader("abc.txt");
			BufferedReader br=new BufferedReader(reader);
			int ch=0;
			while((ch=br.read())!=-1){
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
