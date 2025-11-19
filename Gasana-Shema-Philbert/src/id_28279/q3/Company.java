package id_28279.q3;

import java.time.LocalDate;

public class Company extends Entity {
    private String companyName;
    private String address;
    private String phoneNumber;
    private String email;

    public Company(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber, String email) {
        super(id, createdDate, updatedDate);
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}
