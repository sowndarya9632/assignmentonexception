package com.day1;

public class program4 {

}
class PolicyExpiredException extends Exception {
    public PolicyExpiredException(String message) {
        super(message);
    }
}

class PaymentPendingException extends Exception {
    public PaymentPendingException(String message) {
        super(message);
    }
}

class NonComplianceException extends Exception {
    public NonComplianceException(String message) {
        super(message);
    }
}
