package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class PercentageOperation extends PaymentChecker {
    private double percent = 0.07;

    @Override
    public boolean payment(Payment payment) {
        System.out.println("Charge " +percent +" is Taken.");
        payment.setAmount(payment.getAmount()*(1-percent));
        return checkNext(payment);
    }
}
