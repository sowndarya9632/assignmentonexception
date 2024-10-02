package com.day1;

import java.io.IOException;

public class FileReadException extends Exception {
	private String message;
	private Throwable e;

	
	public FileReadException(String message, Throwable e) {
		super(message,e);
	}
	public String getMessage() {
		return message;
	}
}
