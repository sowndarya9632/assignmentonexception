package com.day1;

import java.util.Scanner;

public class ExceptionHierarchyDemo {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter choice");
    	int choice=s.nextInt();
        try {
            // Change this variable to test different exceptions
            
            if (choice == 1) {
                // This will throw ArithmeticException (division by zero)
                int result = 10 / 0; // Intentional division by zero
            } else if (choice == 2) {
                // This will throw NullPointerException
                String str = null;
                System.out.println(str.length()); // Attempt to access length of null string
            } else {
                System.out.println("No exception triggered.");
            }

        }
    	
        catch (ArithmeticException e) {
            // Handle ArithmeticException
            System.out.println("Error: ArithmeticException occurred - " + e.getMessage());
        } 
        catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("Error: NullPointerException occurred - " + e.getMessage());
        } 
        catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("Error: An unexpected exception occurred - " + e.getMessage());
        }
    }
}

