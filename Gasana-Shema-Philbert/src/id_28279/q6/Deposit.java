package id_28279.q6;

import java.time.LocalDate;

public class Deposit extends Transaction {
    private double depositAmount;
    private LocalDate depositDate;

    public Deposit(int id, LocalDate createdDate, LocalDate updatedDate,
                   String bankName, String branchCode, String address, String bankPhone,
                   String accountNumber, String accountType, double balance,
                   String customerName, String email, String phoneNumber,
                   String transactionId, String transactionType, double amount,
                   double depositAmount, LocalDate depositDate) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);

        if (depositAmount <= 0) throw new Exception("Deposit amount must be > 0");
        this.depositAmount = depositAmount;
        this.depositDate = depositDate;
    }

    public double getDepositAmount() { return depositAmount; }
    public LocalDate getDepositDate() { return depositDate; }
}
