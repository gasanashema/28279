package id_28279.q6;

public class Bank extends Entity {
    private String bankName;
    private String branchCode;
    private String address;
    private String phoneNumber;

    public Bank(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String bankName, String branchCode, String address, String phoneNumber) throws Exception {
        super(id, createdDate, updatedDate);

        if (branchCode.length() < 3) throw new Exception("Branch code must be at least 3 characters");
        if (!phoneNumber.matches("\\d{10}")) throw new Exception("Bank phone must be 10 digits");

        this.bankName = bankName;
        this.branchCode = branchCode;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getBankName() { return bankName; }
    public String getBranchCode() { return branchCode; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}
