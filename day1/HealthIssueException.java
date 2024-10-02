package com.day1;

public class HealthIssueException extends Exception {
	private String message;

	public HealthIssueException(String message) {
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}
}
