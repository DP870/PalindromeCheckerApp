package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 10: 
 * 
 * Description:
 * This class validates a palindrome after preprocessing the input string.
 * 
 * 
 * Checks whether a string is a palindrome.
 * 
 * 
 * @author Dhruv
 * @version 10.0
 * 
 */

import java.util.*;
public class PalindromeCheckerAppTen {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Word: ");
			String input=sc.next();
			input =input.toLowerCase();
			input=input.replaceAll("[^A-Za-z0-9]", "");
			
			boolean isPalindrome=true;
			for (int i=0;i<input.length()/2;i++) {
				if (input.charAt(i)==input.charAt(input.length()-1)) {
					continue;
				}
				else {
					isPalindrome=false;
					break;
				}
			}
			
			
			if (isPalindrome) {
				System.out.println("Word is palindrome");
				}
				else {
					System.out.println("Word is not palindrome");
				}
		}
	}

