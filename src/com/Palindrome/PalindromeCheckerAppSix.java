package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 6: 
 * 
 * Description:
 * This class validates a palindrome using a Queue+ 
 * Stack data structure.
 * 
 * Checks whether a string is a palindrome by converting string to array.
 * 
 * QUEUE-FIFO
 * STACK LIFO
 * 
 * @author Dhruv
 * @version 6.0
 * 
 */

import java.util.*;
public class PalindromeCheckerAppSix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Queue<Character> queue=new LinkedList<>();
		Stack<Character> stack=new Stack<>();
		
		System.out.println("Word: ");
		String input=sc.next();
		
		for (char c:input.toCharArray()) {
			stack.push(c);
			queue.add(c);
		}
		boolean isPalindrome=true;
		
		while(!queue.isEmpty()) {
			if (stack.pop()==queue.remove()) {
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
