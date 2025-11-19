package id_28279.q6;

public class Customer extends Account {
    private String customerName;
    private String email;
    private String phoneNumber;

    public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String bankName, String branchCode, String address, String bankPhone,
                    String accountNumber, String accountType, double balance,
                    String customerName, String email, String phoneNumber) throws Exception {
        super(id, createdDate, updatedDate, bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance);

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid email format");

        if (!phoneNumber.matches("\\d{10}"))
            throw new Exception("Customer phone must be 10 digits");

        // Ensure customer phone != bank phone
        if (phoneNumber.equals(bankPhone)) throw new Exception("Customer phone cannot be same as bank phone");

        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getEmail() { return email; }
    public String getPhoneNumber() { return phoneNumber; }
}
