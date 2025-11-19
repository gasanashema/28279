package id_28279.q6;

public class Loan extends Transaction {
    private double loanAmount;
    private double interestRate;
    private int duration; // in years

    public Loan(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String bankName, String branchCode, String address, String bankPhone,
                String accountNumber, String accountType, double balance,
                String customerName, String email, String phoneNumber,
                String transactionId, String transactionType, double amount,
                double loanAmount, double interestRate, int duration) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, amount);

        if (loanAmount <= 0) throw new Exception("Loan amount must be > 0");
        if (interestRate <= 0) throw new Exception("Interest rate must be > 0");
        if (duration <= 0) throw new Exception("Duration must be > 0");

        this.loanAmount = loanAmount;
        this.interestRate = interestRate;
        this.duration = duration;
    }

    public double getLoanAmount() { return loanAmount; }
    public double getInterestRate() { return interestRate; }
    public int getDuration() { return duration; }
}
