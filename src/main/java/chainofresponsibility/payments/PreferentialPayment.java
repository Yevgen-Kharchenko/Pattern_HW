package chainofresponsibility.payments;

import chainofresponsibility.operations.*;

public class PreferentialPayment extends Payment {
    public PreferentialPayment(Double amount) {
        super(amount);
    }

    @Override
    public PaymentInterface build() {
        PaymentChecker paymentChecker = new ValidateAccounts();
        paymentChecker.linkWiht(new SecurityOperation())
                .linkWiht(new PaymentCheckerType())
                .linkWiht(new CommissionOperation())
                .linkWiht(new TransactionOperation());
        return paymentChecker;
    }
}
