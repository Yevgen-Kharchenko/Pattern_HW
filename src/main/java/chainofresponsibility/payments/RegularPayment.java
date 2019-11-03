package chainofresponsibility.payments;

import chainofresponsibility.operations.*;

public class RegularPayment extends Payment {
    public RegularPayment(Double amount) {
        super(amount);
    }

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
