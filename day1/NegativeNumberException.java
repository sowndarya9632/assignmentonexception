package com.day1;

public class NegativeNumberException extends Exception {
	private String message;

	public NegativeNumberException(String message) {
		this.message=message;
		
	}

	public String getMessage() {
		return message;
	}

}
