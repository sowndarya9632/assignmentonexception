package com.day1;

import java.util.Scanner;

public class PolicyApplication {
    private int age;
    private String drivingHistory;
    private String healthRecords;

    public PolicyApplication(int age, String drivingHistory, String healthRecords) {
        this.age = age;
        this.drivingHistory = drivingHistory;
        this.healthRecords = healthRecords;
    }

    public void validate() throws InvalidAgeException, PoorDrivingRecordException, HealthIssueException {
        validateAge();
        validateDrivingHistory();
        validateHealthRecords();
    }

    private void validateAge() throws InvalidAgeException {
        if (age < 18 || age > 65) {
            throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 18 and 65.");
        }
    }

    private void validateDrivingHistory() throws PoorDrivingRecordException {
        if (drivingHistory.equalsIgnoreCase("poor")) {
            throw new PoorDrivingRecordException("Driving record is poor. Application denied.");
        }
    }

    private void validateHealthRecords() throws HealthIssueException {
        if (healthRecords.equalsIgnoreCase("serious")) {
            throw new HealthIssueException("Health records indicate serious issues. Application denied.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter driving history (good/poor): ");
        String drivingHistory = scanner.nextLine();

        System.out.print("Enter health records (good/serious): ");
        String healthRecords = scanner.nextLine();

        PolicyApplication application = new PolicyApplication(age, drivingHistory, healthRecords);

        try {
            application.validate();
            System.out.println("Application submitted successfully.");
        } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
            System.out.println("Error: " + e.getMessage());
            // Log the error for review (printing to console for simplicity)
            System.err.println("Logging error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

