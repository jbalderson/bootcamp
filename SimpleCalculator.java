package com.tn.qa.pages;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner scanner = new
			Scanner(System.in);
		
		System.out.println("Enter the first number ");
		double number1 = scanner.nextDouble();
		
		System.out.println("Enter the second number ");
		
		double number2 = scanner.nextDouble();
		System.out.println("Enter the operator (+ , - , * , /)");
		char operator = scanner.next().charAt(0);
		
		double result = 0 ;
		
		switch (operator) {
		case '+':
		result = number1 + number2;
		break;
		case '*':
		result = number1 * number2;
		break;
		case'/':
		if (number2 != 0) {
			result = number1 / number2;
		}else {
			System.out.println("Error: Dividing by zero is impossible!");
			System.exit(0);
		}
		break;
		default:
		System.out.println("Error: invalid operator");
		System.exit(0);
	}
		System.out.println("Result: " + result);
		}

	}


