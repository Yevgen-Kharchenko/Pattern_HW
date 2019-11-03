package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class CommissionOperation extends PaymentChecker {
    private double commission = 3.0;

    @Override
    public boolean payment(Payment payment) {
        System.out.println("Commission " +commission +" is Taken.");
        payment.setAmount(payment.getAmount()-commission);
        return checkNext(payment);
    }
}
