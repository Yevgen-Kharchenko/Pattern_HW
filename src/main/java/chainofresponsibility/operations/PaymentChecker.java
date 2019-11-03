package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public abstract class PaymentChecker implements PaymentInterface {
    private PaymentChecker next;

    public PaymentChecker linkWiht(PaymentChecker next) {
        this.next = next;
        return next;
    }

    public abstract boolean payment(Payment payment);

    protected boolean checkNext(Payment payment) {
        if (next == null) {
            return true;
        } else return next.payment(payment);
    }
}
