package chainofresponsibility.payments;

import chainofresponsibility.operations.*;

public class InnerBankPayment extends Payment {
    public InnerBankPayment(Double amount) {
        super(amount);
    }

    @Override
    public PaymentInterface build() {
        PaymentChecker paymentChecker = new ValidateAccounts();
        paymentChecker.linkWiht(new SecurityOperation())
                .linkWiht(new PaymentCheckerType())
                .linkWiht(new TransactionOperation());
        return paymentChecker;
    }
}
