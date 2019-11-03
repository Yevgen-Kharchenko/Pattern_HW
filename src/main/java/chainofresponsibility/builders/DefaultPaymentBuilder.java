package chainofresponsibility.builders;

import chainofresponsibility.operations.*;
import chainofresponsibility.payments.PaymentBuilder;

public class DefaultPaymentBuilder implements PaymentBuilder {
    @Override
    public PaymentInterface build() {
        PaymentChecker paymentChecker = new ValidateAccounts();
        paymentChecker.linkWiht(new SecurityOperation())
                .linkWiht(new PaymentCheckerType())
                .linkWiht(new PercentageOperation())
                .linkWiht(new TransactionOperation());
        return paymentChecker;
    }
}
