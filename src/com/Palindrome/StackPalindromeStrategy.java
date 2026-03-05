package com.Palindrome;
import java.util.*;
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