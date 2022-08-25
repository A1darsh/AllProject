package filehandeling;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter something");
		String input=sc.next();
		
		FileOutputStream fos=new FileOutputStream("abc.txt");
		byte[] bytes =input.getBytes();
		fos.write(bytes);
}
}
