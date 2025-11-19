package id_28279.q10;

public class Payment {
    private String paymentMethod, paymentStatus;

    public Payment(String paymentMethod, String paymentStatus) throws Exception {
        if (paymentMethod.isEmpty() || paymentStatus.isEmpty())
            throw new Exception("Payment information cannot be empty");
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public String getPaymentStatus() { return paymentStatus; }
}
