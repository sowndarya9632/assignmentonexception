package com.day1;

class PolicyRenewal {
    private boolean isPolicyActive;
    private boolean hasPendingPayments;
    private boolean isCompliant;

    public PolicyRenewal(boolean isPolicyActive, boolean hasPendingPayments, boolean isCompliant) {
        this.isPolicyActive = isPolicyActive;
        this.hasPendingPayments = hasPendingPayments;
        this.isCompliant = isCompliant;
    }

    public void renewPolicy() throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (!isPolicyActive) {
            throw new PolicyExpiredException("The policy is expired and cannot be renewed.");
        }
        if (hasPendingPayments) {
            throw new PaymentPendingException("There are pending payments associated with this policy.");
        }
        if (!isCompliant) {
            throw new NonComplianceException("The policyholder is not compliant with renewal terms.");
        }

        // Logic for renewing the policy
        System.out.println("The policy has been successfully renewed.");
    }
}
public class Main {
    public static void main(String[] args) {
        PolicyRenewal policy = new PolicyRenewal(true, false, true); // Example of an expired policy

        try {
            policy.renewPolicy();
        } catch (PolicyExpiredException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PaymentPendingException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NonComplianceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

