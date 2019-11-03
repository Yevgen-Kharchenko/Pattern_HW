package chainofresponsibility;

import chainofresponsibility.builders.DefaultPaymentBuilder;
import chainofresponsibility.operations.PaymentChecker;
import chainofresponsibility.payments.BudgetPayment;
import chainofresponsibility.payments.InnerBankPayment;
import chainofresponsibility.payments.PreferentialPayment;
import chainofresponsibility.payments.RegularPayment;

public class App {
    public static void main(String[] args) {
        System.out.println("Budget payment:");
        BudgetPayment budgetPayment= new BudgetPayment(100.0);
        PaymentChecker paymentChecker= (PaymentChecker) budgetPayment.build();
        paymentChecker.payment(budgetPayment);

        System.out.println("\nInner bank payment:");
        InnerBankPayment innerBankPayment =new InnerBankPayment(100.0);
        paymentChecker= (PaymentChecker) innerBankPayment.build();
        paymentChecker.payment(innerBankPayment);

        System.out.println("\nRegular payment:");
        RegularPayment regularPayment = new RegularPayment(100.0);
        paymentChecker= (PaymentChecker) regularPayment.build();
        paymentChecker.payment(regularPayment);

        System.out.println("\nPreferential payment:");
        PreferentialPayment preferentialPayment = new PreferentialPayment(100.0);
        paymentChecker= (PaymentChecker) preferentialPayment.build();
        paymentChecker.payment(preferentialPayment);


    }
}
