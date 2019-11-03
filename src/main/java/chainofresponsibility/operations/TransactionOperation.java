package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class TransactionOperation extends PaymentChecker {
    @Override
    public boolean payment(Payment payment) {
        System.out.println("Transaction. Your amount: " + payment.getAmount());
        return checkNext(payment);
    }
}
