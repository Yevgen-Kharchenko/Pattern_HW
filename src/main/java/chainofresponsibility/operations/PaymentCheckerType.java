package chainofresponsibility.operations;

import chainofresponsibility.payments.*;

public class PaymentCheckerType extends PaymentChecker {
    @Override
    public boolean payment(Payment payment) {
        doAccordingType(payment);
        return checkNext(payment);
    }

    private void doAccordingType(Payment payment) {
        if (payment instanceof BudgetPayment) {
            System.out.println("Operating with budget Payment");
        } else if (payment instanceof RegularPayment) {
            System.out.println("Operation with regular Payment");
        } else if (payment instanceof InnerBankPayment) {
            System.out.println("Operating with inner bank Payment");
        } else if (payment instanceof PreferentialPayment) {
            System.out.println("Operating with preferential Payment");
        }
    }
}
