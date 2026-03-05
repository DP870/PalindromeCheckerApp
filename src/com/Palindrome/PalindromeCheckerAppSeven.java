package com.Palindrome;
/* Main Class - UseCasePalindromeApp
 * 
 * Use Case 8: 
 * 
 * Description:
 * This class validates a palindrome using a LinkedList.
 * data structure.
 * 
 * Checks whether a string is a palindrome.
 * 
 * 
 * @author Dhruv
 * @version 8.0
 * 
 */
import java.util.*;
public class PalindromeCheckerAppSeven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<Character> list=new LinkedList<>();
		
		System.out.println("Word: ");
		String input=sc.next();
		
		for (char c : input.toCharArray()) {
            list.add(c);
        }
		boolean isPalindrome=true;
		
		while(list.size() > 1) {
			if (list.removeFirst()==list.removeLast()) {
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
