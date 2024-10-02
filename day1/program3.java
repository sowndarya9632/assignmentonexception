package com.day1;

public class program3 {

}
class DataNotFoundException extends Exception {
    public DataNotFoundException(String message) {
        super(message);
    }
}

class CalculationException extends RuntimeException {
    public CalculationException(String message) {
        super(message);
    }
}

