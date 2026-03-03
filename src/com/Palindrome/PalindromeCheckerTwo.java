package com.Palindrome;

public class PalindromeCheckerTwo {
	public static void main(String[] args) {
		
	System.out.println("Welcome to the Palindrome App");
	System.out.println("Version: 1.0");
	System.out.println("System intializaed successfully");
	System.out.println("===============================");
	
	System.out.println("Word: madam");
	String input="madam";
	boolean test=true;
	String test2=input.substring(input.length()/2,input.length());
	for (int i=0;i<=input.length()/2;i++) {
		if (input.charAt(i) != input.charAt(input.length()-1-i)) {
			test=false;
			break;
		}
	}
	if (test) {
		System.out.println("Word is palindrome");
	}
	else {
		System.out.println("Word is not palindrome");
	}
}
}
