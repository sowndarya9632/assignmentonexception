package com.day1;

import java.util.Scanner;

public class PremiumCalculator {
    
    // Method to calculate life insurance premium
    public double calculateLifeInsurancePremium(int age) throws DataNotFoundException {
        if (age <= 0) {
            throw new DataNotFoundException("Age must be greater than zero.");
        }
        return age * 100; // Example calculation
    }

    // Method to calculate health insurance premium
    public double calculateHealthInsurancePremium(int age, boolean hasPreExistingCondition) throws DataNotFoundException  {
        if (age <= 0) {
            throw new DataNotFoundException("Age must be greater than zero.");
        }
        double premium = age * 150; // Base premium calculation
        if (hasPreExistingCondition) {
            premium += 500; // Additional charge for pre-existing conditions
        }
        return premium;
    }

    // Method to calculate vehicle insurance premium
    public double calculateVehicleInsurancePremium(String vehicleType) throws DataNotFoundException {
        if (vehicleType == null || vehicleType.isEmpty()) {
            throw new DataNotFoundException("Vehicle type must not be empty.");
        }
        switch (vehicleType.toLowerCase()) {
            case "car":
                return 1200; // Car premium
            case "motorcycle":
                return 800; // Motorcycle premium
            case "truck":
                return 1500; // Truck premium
            default:
                throw new CalculationException("Unknown vehicle type for premium calculation.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PremiumCalculator calculator = new PremiumCalculator();

        try {
            // Input for Life Insurance
            System.out.print("Enter age for life insurance: ");
            int age = scanner.nextInt();
            double lifePremium = calculator.calculateLifeInsurancePremium(age);
            System.out.println("Life Insurance Premium: $" + lifePremium);

            // Input for Health Insurance
            System.out.print("Enter age for health insurance: ");
            age = scanner.nextInt();
            System.out.print("Has pre-existing condition (true/false): ");
            boolean hasCondition = scanner.nextBoolean();
            double healthPremium = calculator.calculateHealthInsurancePremium(age, hasCondition);
            System.out.println("Health Insurance Premium: $" + healthPremium);

            // Input for Vehicle Insurance
            System.out.print("Enter vehicle type (car/motorcycle/truck): ");
            String vehicleType = scanner.next();
            double vehiclePremium = calculator.calculateVehicleInsurancePremium(vehicleType);
            System.out.println("Vehicle Insurance Premium: $" + vehiclePremium);

        } catch (DataNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CalculationException e) {
            System.out.println("Calculation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
