package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class SecurityOperation extends PaymentChecker {

    @Override
    public boolean payment(Payment payment) {
        System.out.println("Security");
        return checkNext(payment);
    }
}
