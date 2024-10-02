package com.day1;

import java.util.Scanner;

public class CustomUnchecked {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int number = scanner.nextInt();

		try {
			// Validate the input number
			validateNumber(number);
			System.out.println("You entered: " + number);
		} 
		catch (NegativeNumberException e) {
			// Handle the custom exception
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			// Close the scanner
			scanner.close();
		}

	}

	private static void validateNumber(int number) throws NegativeNumberException {
		 if (number < 0) {
	            throw new NegativeNumberException("Negative numbers are not allowed.");		
	}
	}
}
