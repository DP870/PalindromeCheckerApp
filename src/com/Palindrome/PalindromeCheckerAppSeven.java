package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 7: 
 * 
 * Description:
 * This class validates a palindrome using a Dequeue (Double Ended Queue)
 * data structure.
 * 
 * Checks whether a string is a palindrome by inserting characters in the dequeue..
 * 
 * 
 * @author Dhruv
 * @version 7.0
 * 
 */

import java.util.*;

public class PalindromeCheckerAppSeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Deque<Character> deque=new ArrayDeque<>();
		
		
		System.out.println("Word: ");
		String input=sc.next();
		
		for (char c:input.toCharArray()) {
			deque.addLast(c);
		}
		boolean isPalindrome=true;
		
		while(deque.size() > 1) {
			if (deque.removeFirst()==deque.removeLast()) {
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
