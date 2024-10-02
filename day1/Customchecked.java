package com.day1;

import java.util.Scanner;

public class Customchecked {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();
		// Validate age
		try {
		validateAge(age);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		 
	}

	public static void validateAge(int age) throws InvalidAgeException {
		if(age>=18) {
			System.out.println("eligeable for vote");
		}
		else {
			throw new InvalidAgeException("Age must be 18 or older.");
		}
	}
}
