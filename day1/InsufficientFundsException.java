package com.day1;

public class InsufficientFundsException extends Exception {
	private String message;

	public InsufficientFundsException(String message) {
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}
}
