package com.tn.qa.pages;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		Scanner scanner = new
				Scanner(System.in);
			System.out.println("Enter a string: ");
			String input = scanner.nextLine();
			
			String reversed = reverseString(input);
			System.out.println("Reversed string: " + reversed);
	}
			
			public static String reverseString(String str) {
				StringBuilder sb =new StringBuilder(str);
				sb.reverse();
				return sb.toString();
			}
	}

