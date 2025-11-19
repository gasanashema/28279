package id_28279.q1;

import java.time.LocalDate;

public class Doctor extends Department {

    private String doctorName;
    private String specialization;
    private String doctorEmail;
    private String phone;

    public Doctor(int id, LocalDate createdDate, LocalDate updatedDate,
            String hospitalName, String address, String phoneNumber, String email,
            String departmentName, String departmentCode,
            String doctorName, String specialization,
            String doctorEmail, String phone)
            throws HospitalDataException {

        super(id, createdDate, updatedDate,
                hospitalName, address, phoneNumber, email,
                departmentName, departmentCode);

        if (doctorName == null || doctorName.isEmpty())
            throw new HospitalDataException("Doctor name cannot be empty");

        if (specialization == null || specialization.isEmpty())
            throw new HospitalDataException("Specialization cannot be empty");

        if (!doctorEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            throw new HospitalDataException("Invalid doctor email");

        if (!phone.matches("\\d{10}"))
            throw new HospitalDataException("Doctor phone must be 10 digits");

        this.doctorName = doctorName;
        this.specialization = specialization;
        this.doctorEmail = doctorEmail;
        this.phone = phone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getDoctorEmail() {
        return doctorEmail;
    }

    public String getDoctorPhone() {
        return phone;
    }
}
