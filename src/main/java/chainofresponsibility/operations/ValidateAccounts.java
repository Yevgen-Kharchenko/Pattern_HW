package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class ValidateAccounts extends PaymentChecker {
    @Override
    public boolean payment(Payment payment) {
        System.out.println("Validating accounts");
        if (checkAccountsLength(payment) || equalityOfAccounts(payment)) {
            System.out.println("Validation failed");
            return false;
        }
        System.out.println("Validation successful");
        return checkNext(payment);
    }

    private boolean checkAccountsLength(Payment payment) {
        int length = payment.getDebet().length();
        return payment.getDebet().length() != 9 || payment.getKredit().length() != 9;
    }

    private boolean equalityOfAccounts(Payment payment) {
        return payment.getDebet().equals(payment.getKredit());
    }
}
