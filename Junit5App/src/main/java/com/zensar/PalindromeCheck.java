package com.zensar;

public class PalindromeCheck {

	public boolean isPalindrome(String str) {
		
		String reverse="";
		int length=str.length();
		for (int i=length-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		
		}
		if (str.equals(reverse)) {
			return true;	
		}
		else {
			return false;
		}
			
	}
	



}
