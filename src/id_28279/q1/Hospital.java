package id_28279.q1;

import java.time.LocalDate;

public class Hospital extends Entity {

    private String hospitalName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hospital(int id, LocalDate createdDate, LocalDate updatedDate,
            String hospitalName, String address, String phoneNumber, String email)
            throws HospitalDataException {

        super(id, createdDate, updatedDate);

        if (hospitalName == null || hospitalName.isEmpty())
            throw new HospitalDataException("Hospital name cannot be empty");

        if (address == null || address.isEmpty())
            throw new HospitalDataException("Address cannot be empty");

        if (!phoneNumber.matches("\\d{10}"))
            throw new HospitalDataException("Phone must be 10 digits");

        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            throw new HospitalDataException("Invalid email format");

        this.hospitalName = hospitalName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public String getAddress() {
        return address;
    }

    public String getHospitalPhone() {
        return phoneNumber;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHospitalEmail() {
        return email;
    }

}
