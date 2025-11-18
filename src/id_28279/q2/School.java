package id_28279.q2;

import java.time.LocalDate;

public class School extends Entity {
    private String schoolName;
    private String address;
    private String phoneNumber;
    private String email;

    public School(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String phoneNumber, String email) throws Exception {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}"))
            throw new Exception("Invalid school phone");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid email");

        this.schoolName = schoolName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getAddress() {
        return address;
    }

    public String getSchoolPhone() {
        return phoneNumber;
    }

    public String getSchoolEmail() {
        return email;
    }
}
