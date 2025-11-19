package id_28279.q6;

public class Account extends Bank {
    private String accountNumber;
    private String accountType;
    private double balance;

    public Account(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String bankName, String branchCode, String address, String phoneNumber,
                   String accountNumber, String accountType, double balance) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, phoneNumber);

        if (balance < 0) throw new Exception("Account balance cannot be negative");

        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountType() { return accountType; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }
}
