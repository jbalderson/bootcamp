package com.tn.qa.pages;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
         Scanner scanner = new
        		Scanner(System.in);
         System.out.println("Enter a string: ");
         String input = scanner.nextLine();
         
         if (isPalindrome(input)) {
        	 System.out.println("The string \"" + input + "\" is not a palindrome.");
         }
	}
	 
	public static boolean isPalindrome(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase();
		
		int left = 0;
		int right = str.length() - 1;
		
		while (left< right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			
			left++;
			right--;
		} 
		return true; 
		
			}
		
	}

