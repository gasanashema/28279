package id_28279.q5;

import java.time.LocalDate;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;

    public Company(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber) throws Exception {
        super(id, createdDate, updatedDate);

        if (companyName.isEmpty()) throw new Exception("Company name cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new Exception("Phone number must be 10 digits");

        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() { return companyName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
}
