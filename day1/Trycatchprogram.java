package com.day1;

import java.util.Scanner;

public class Trycatchprogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int inputNumber = scanner.nextInt();

        try {
            // Attempt to divide 100 by the input number
            int result = 100 / inputNumber;
            System.out.println("100 divided by " + inputNumber + " is: " + result);
        } catch (ArithmeticException e) {
            // Handle the case where the input number is zero
            System.out.println("Error: Cannot divide by zero. Please enter a non-zero integer.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}

