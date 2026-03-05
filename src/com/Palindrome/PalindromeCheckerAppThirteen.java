package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 13: 
 * 
 * Description:
 * This class validates a palindrome using strategy patterns and calculate amount of time taken for execution.
 * 
 * 
 * Checks whether a string is a palindrome.
 * 
 * 
 * @author Dhruv
 * @version 13.0
 * 
 */
import java.util.*;
  
public class PalindromeCheckerAppThirteen {
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        StackPalindromeStrategy checker = new StackPalindromeStrategy();

        System.out.print("Word ");
        String input = sc.nextLine();
        
        long startTime = System.nanoTime();
        boolean status =checker.isPalindrome(input);
        long endTime = System.nanoTime();

        if(status){
        	System.out.println("Word is palindrome");
		}
		else {
			System.out.println("Word is not palindrome");
		}
        
        
        
        long duration = endTime - startTime;
        double durationmil = duration / 1_000_000.0;
        System.out.println("Time taken for execution in milliseconds "+durationmil);
        }

	
}
