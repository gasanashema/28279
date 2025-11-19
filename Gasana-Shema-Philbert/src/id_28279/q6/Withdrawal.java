package id_28279.q6;

import java.time.LocalDate;

public class Withdrawal extends Transaction {
    private double withdrawalAmount;
    private LocalDate withdrawalDate;

    public Withdrawal(int id, LocalDate createdDate, LocalDate updatedDate,
                      String bankName, String branchCode, String address, String bankPhone,
                      String accountNumber, String accountType, double balance,
                      String customerName, String email, String phoneNumber,
                      String transactionId, String transactionType, double amount,
                      double withdrawalAmount, LocalDate withdrawalDate) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);

        if (withdrawalAmount <= 0) throw new Exception("Withdrawal amount must be > 0");
        this.withdrawalAmount = withdrawalAmount;
        this.withdrawalDate = withdrawalDate;
    }

    public double getWithdrawalAmount() { return withdrawalAmount; }
    public LocalDate getWithdrawalDate() { return withdrawalDate; }
}
