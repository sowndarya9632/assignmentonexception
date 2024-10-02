package com.day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionChainingDemo {

    public static void readFile(String fileName) throws FileReadException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // Attempt to read the first line of the file
            String line = br.readLine();
            System.out.println("First line of the file: " + line);
        } catch (IOException e) {
            // Throw a custom exception with the cause being the IOException
            throw new FileReadException("Failed to read the file.", e);
        }
    }

    public static void main(String[] args) {
        String fileName = "nonexistent.txt"; // Example file name that doesn't exist

        try {
            readFile(fileName);
        } catch (FileReadException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}