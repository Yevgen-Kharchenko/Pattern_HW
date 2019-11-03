package chainofresponsibility.payments;

import chainofresponsibility.operations.PaymentInterface;

public abstract class Payment implements PaymentBuilder {
    private Double amount;
    private String debet = "260012345";
    private String kredit = "260001346";

    public Payment(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDebet() {
        return debet;
    }

    public void setDebet(String debet) {
        this.debet = debet;
    }

    public String getKredit() {
        return kredit;
    }

    public void setKredit(String kredit) {
        this.kredit = kredit;
    }

    @Override
    abstract public PaymentInterface build();

}
