package com.Palindrome;
import java.util.*;

/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 12: 
 * 
 * Description:
 * This class validates a palindrome using strategy patterns.
 * 
 * 
 * Checks whether a string is a palindrome.
 * 
 * 
 * @author Dhruv
 * @version 12.0
 * 
 */
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}



	class StackPalindromeStrategy implements PalindromeStrategy {
	   
	    public boolean isPalindrome(String input) {
	        
	        Stack<Character> stack = new Stack<>();
	        
	        for (char c : input.toCharArray()) {
	            stack.push(c);
	        }
	        for (char c : input.toCharArray()) {
	            if (c != stack.pop()) {
	                return false;
	            }
	        }
	        return true;
	    }
	}

	public class PalindromeCheckerAppTwelve {

	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        StackPalindromeStrategy checker = new StackPalindromeStrategy();

	        System.out.print("Word ");
	        String input = sc.nextLine();
	   
	       
	        if(checker.isPalindrome(input)){
	        	System.out.println("Word is palindrome");
			}
			else {
				System.out.println("Word is not palindrome");
			}
	        }

	     
	    }


	