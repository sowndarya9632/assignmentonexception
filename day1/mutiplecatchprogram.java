package com.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class mutiplecatchprogram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter the first integer: ");
			int firstNumber = scanner.nextInt();

			System.out.print("Enter the second integer: ");
			int secondNumber = scanner.nextInt();

			// Attempt to divide firstNumber by secondNumber
			int result = firstNumber / secondNumber;
			System.out.println(firstNumber + " divided by " + secondNumber + " is: " + result);

		} catch (ArithmeticException | InputMismatchException e) {
			// Handle division by zero
			System.out.println("Error: Cannot divide by zero. Please enter a non-zero second integer.");
		}
		/*
		 * catch (InputMismatchException e) { // Handle non-integer input
		 * System.out.println("Error: Please enter valid integer values."); }
		 */
		finally {
			// Close the scanner
			scanner.close();
		}
	}
}
