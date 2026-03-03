/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 4: Char Array Palindrome Check
 * 
 * Description:
 * This class represents the entry point of the Palindrome 
 * Checker App.
 * 
 * Checks whether a string is a palindrome by converting string to array.
 * 
 * @author Dhruv
 * @version 1.0
 * 
 */



package com.Palindrome;
import java.util.Scanner;
public class PalindromeCheckerAppThree {

	public static void main(String[] args) {
		String input;
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		input=sc.next();
		char[] chars=input.toCharArray();
		int start=0;
		int end=chars.length-1;
		boolean isPalindrome=true;
		while (start<end) {
			if (chars[start]==chars[end]) {
				start+=1;
				end-=1;
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
	


