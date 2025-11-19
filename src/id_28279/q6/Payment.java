package id_28279.q6;

import java.time.LocalDate;

public class Payment extends Transaction {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String bankName, String branchCode, String address, String bankPhone,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double paymentAmount, LocalDate paymentDate) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);

        if (paymentAmount <= 0) throw new Exception("Payment amount must be > 0");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public LocalDate getPaymentDate() { return paymentDate; }
}
