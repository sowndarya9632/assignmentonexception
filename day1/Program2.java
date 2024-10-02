package com.day1;

public class Program2 {
}
class FraudulentClaimException extends RuntimeException {
    public FraudulentClaimException(String message) {
        super(message);
    }
}

class InvalidClaimAmountException extends RuntimeException {
    public InvalidClaimAmountException(String message) {
        super(message);
    }
}

