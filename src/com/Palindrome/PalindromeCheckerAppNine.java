package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 9: 
 * 
 * Description:
 * This class validates a palindrome using recurssion.
 * 
 * 
 * Checks whether a string is a palindrome.
 * 
 * 
 * @author Dhruv
 * @version 9.0
 * 
 */
import java.util.*;
public class PalindromeCheckerAppNine {
	
	public static boolean palindromecheck(String str, int start, int end) {
        
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return palindromecheck(str, start + 1, end - 1);
    }
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Character> list=new LinkedList<>();
		
		System.out.println("Word: ");
		String input=sc.next();
		
		boolean isPalindrome=palindromecheck(input,0,input.length()-1);
		if (isPalindrome) {
			System.out.println("Word is palindrome");
			}
			else {
				System.out.println("Word is not palindrome");
			}
	}
}