package com.day1;

import java.util.Scanner;

public class BankingSystem {
	private double balance;

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance) {
			throw new InsufficientFundsException("Withdrawal amount exceeds available balance.");
		}
		balance -= amount;
		System.out.println("Withdrawal successful! New balance: " + balance);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create a banking system with an initial balance
		BankingSystem account = new BankingSystem(); // Initial balance of $500
		System.out.println("enter intial balance");
		account.setBalance(scanner.nextInt());
		System.out.print("Enter amount to withdraw: ");
		double amountToWithdraw = scanner.nextDouble();

		try {
			account.withdraw(amountToWithdraw);
		} catch (InsufficientFundsException e) {
			// Handle the InsufficientFundsException
			System.out.println("Error: " + e.getMessage());
		} finally {
			// Display the current balance
			System.out.println("Current balance: " + account.getBalance());
			scanner.close(); // Close the scanner
		}
	}
}
