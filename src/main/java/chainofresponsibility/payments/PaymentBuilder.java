package chainofresponsibility.payments;

import chainofresponsibility.operations.PaymentInterface;

public interface PaymentBuilder {
    PaymentInterface build();
}
