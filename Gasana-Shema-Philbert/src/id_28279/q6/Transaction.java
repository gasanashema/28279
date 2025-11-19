package id_28279.q6;

public class Transaction extends Customer {
    private String transactionId;
    private String transactionType;
    private double amount;

    public Transaction(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                       String bankName, String branchCode, String address, String bankPhone,
                       String accountNumber, String accountType, double balance,
                       String customerName, String email, String phoneNumber,
                       String transactionId, String transactionType, double amount) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber);

        if (amount <= 0) throw new Exception("Transaction amount must be > 0");
        if (transactionId.isEmpty()) throw new Exception("Transaction ID cannot be empty");
        if (transactionType.isEmpty()) throw new Exception("Transaction type cannot be empty");

        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getTransactionId() { return transactionId; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
}
