package chainofresponsibility.payments;

import chainofresponsibility.operations.*;

public class BudgetPayment extends Payment {
    public BudgetPayment(Double amount) {
        super(amount);
    }

    @Override
    public PaymentInterface build() {
        PaymentChecker paymentChecker = new ValidateAccounts();
        paymentChecker.linkWiht(new SecurityOperation())
                .linkWiht(new PaymentCheckerType())
                .linkWiht(new TaxFixation())
                .linkWiht(new TransactionOperation());
        return paymentChecker;
    }
}
