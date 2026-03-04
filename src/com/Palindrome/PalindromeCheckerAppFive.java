/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 5: 
 * 
 * Description:
 * This class validated a palindrome using a Stack 
 * data structure.
 * 
 * Checks whether a string is a palindrome by converting string to array.
 * 
 * @author Dhruv
 * @version 1.0
 * 
 */

package com.Palindrome;
import java.util.*;

public class PalindromeCheckerAppFive {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Word: ");
	String input=sc.next();
	Stack<Character> stack = new Stack<>();
	
	for (char c:input.toCharArray()) {
		stack.push(c);
	}
	boolean isPalindrome=true;
	
	for (char s:input.toCharArray()) {
		if (s==stack.pop()) {
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
