package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public interface PaymentInterface {
    public abstract boolean payment(Payment payment);

}
