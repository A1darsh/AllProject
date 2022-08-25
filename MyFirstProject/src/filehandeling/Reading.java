package filehandeling;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;

public class Reading {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("new.txt");
		int readData;
		
		while((readData=fis.read())!=-1) {
			System.out.print((char)readData);
			
				
		}
		

	}
	

}
