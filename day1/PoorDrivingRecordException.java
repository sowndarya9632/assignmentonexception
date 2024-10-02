package com.day1;

public class PoorDrivingRecordException extends Exception {
	private String message;

	public PoorDrivingRecordException(String message) {
		this.message=message;
		
	}
	public String getMessage() {
		return message;
	}
}
