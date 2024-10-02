package com.day1;

import java.time.LocalDate;
import java.util.Scanner;

public class ClaimProcessingSystem {
    private static final double MAX_CLAIM_AMOUNT = 10000.00; // Maximum claim amount for validation
    private static final LocalDate MAX_CLAIM_DATE = LocalDate.now().minusDays(30); // Claims older than 30 days are invalid

    public void processClaim(double claimAmount, LocalDate claimDate) {
        validateClaimAmount(claimAmount);
        validateClaimDate(claimDate);
        
        System.out.println("Claim of amount $" + claimAmount + " processed successfully on " + claimDate);
    }

    private void validateClaimAmount(double claimAmount) throws InvalidClaimAmountException {
        if (claimAmount <= 0) {
            throw new InvalidClaimAmountException("Claim amount must be greater than zero.");
        }
        if (claimAmount > MAX_CLAIM_AMOUNT) {
            throw new FraudulentClaimException("Claim amount exceeds the maximum limit of $" + MAX_CLAIM_AMOUNT);
        }
    }

    private void validateClaimDate(LocalDate claimDate) {
        if (claimDate.isBefore(MAX_CLAIM_DATE)) {
            throw new FraudulentClaimException("Claims older than 30 days cannot be processed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter claim amount: ");
        double claimAmount = scanner.nextDouble();

        System.out.print("Enter claim date (YYYY-MM-DD): ");
        String dateInput = scanner.next();
        LocalDate claimDate = LocalDate.parse(dateInput);

        ClaimProcessingSystem claimSystem = new ClaimProcessingSystem();

        try {
            claimSystem.processClaim(claimAmount, claimDate);
        } catch (InvalidClaimAmountException | FraudulentClaimException e) {
            System.out.println("Error: " + e.getMessage());
            // Notify claims department for further investigation
            System.err.println("Notification: Claims department notified for investigation.");
        } finally {
            scanner.close();
        }
    }
}

