package shape;

import java.io.IOException;


public class VotingApplication {
	public void vote(int x){
		if (x<18){
			try {
				throw new IOException();
			} catch (IOException e) {
				System.out.println("Invalid age");
			}
		}
		else{
			System.out.println("you are able for vote");
		}
	}
	

}
