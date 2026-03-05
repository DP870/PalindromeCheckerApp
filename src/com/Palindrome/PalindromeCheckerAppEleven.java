package com.Palindrome;
import java.util.*;

class PalindromeChecker {
    private String text;

    
    public PalindromeChecker(String text) {
        this.text = text.trim();
    }

   
    public boolean isPalindrome() {
        
        String cleaninput = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaninput.length() - 1;

        while (left < right) {
            if (cleaninput.charAt(left) == cleaninput.charAt(right)) {
            	left++;
                right--;
                continue;
            }
            else {
            	return false;
            }
            
        }
        return true;
    }

}


public class PalindromeCheckerAppEleven {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Word: ");
	        String input = sc.nextLine();

	      
	            PalindromeChecker checker = new PalindromeChecker(input);
	            if (checker.isPalindrome()) {
	                System.out.println("Word is a palindrome.");
	            } else {
	                System.out.println("Word is not a palindrome.");
	            }
	       
	    }
}



	
	
	
	   
