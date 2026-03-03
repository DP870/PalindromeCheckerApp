/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 3: Reverse String Based Palindrome Check
 * 
 * Description:
 * This class represents the entry point of the Palindrome 
 * Checker App.
 * 
 * Checks whether a string is a palindrome by reversing the string and compaing it.
 * 
 * @author Dhruv
 * @version 1.0
 * 
 */


package com.Palindrome;
import java.util.Scanner;
public class PalindromeCheckerThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the Palindrome App");
		System.out.println("Version: 1.0");
		System.out.println("System intializaed successfully");
		System.out.println("===============================");
		
		System.out.println("Word: ");
		String input=sc.next();
		
		String test2="";
		
		for (int i=input.length()-1;i>=0;i--) {
			char letter=input.charAt(i);
			test2=test2+letter;
			}
		if (input.equals(test2)) {
			System.out.println("Word is palindrome");
		}
		else {
			System.out.println("Word is not palindrome");
		}
	}
}
