package chainofresponsibility.operations;

import chainofresponsibility.payments.Payment;

public class TaxFixation extends PaymentChecker {
    @Override
    public boolean payment(Payment payment) {
        System.out.println("Tax fixation");
        return checkNext(payment);
    }
}
