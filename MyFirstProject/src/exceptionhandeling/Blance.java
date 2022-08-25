package exceptionhandeling;

import java.util.Scanner;

public class Blance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		int balance=sc.nextInt();
		int amount=5000;
		try {
			if (balance<amount) 
			{	throw new ArithmeticException("insuffisiunt balnce");
			}
			System.out.println("tansection successfully");
			balance=amount-balance;
			System.out.println("remaning balance is:"+balance);
		}catch(ArithmeticException e) {
		    System.out.println(e.getMessage());
	}	}

}
