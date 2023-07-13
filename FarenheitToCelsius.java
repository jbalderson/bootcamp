package com.tn.qa.pages;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		Scanner scanner = new
				Scanner(System.in);
		System.out.println("Enter temperature in farenheit");
		double farenheit = 
				scanner.nextDouble();
		
		double celsius = (farenheit - 32) * 5 / 9; 
		
		System.out.println("The temperature in celsius is: " + celsius);

	}

}
