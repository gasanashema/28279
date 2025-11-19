package id_28279.q1;

import java.time.LocalDate;

public class Nurse extends Doctor {

    private String nurseName;
    private String shift;
    private int yearsOfExperience;

    public Nurse(int id, LocalDate createdDate, LocalDate updatedDate,
                 String hospitalName, String address, String phoneNumber, String email,
                 String departmentName, String departmentCode,
                 String doctorName, String specialization, String doctorEmail, String phone,
                 String nurseName, String shift, int yearsOfExperience)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone);

        if (nurseName == null || nurseName.isEmpty())
            throw new HospitalDataException("Nurse name cannot be empty");

        if (!shift.equalsIgnoreCase("Day") && !shift.equalsIgnoreCase("Night"))
            throw new HospitalDataException("Shift must be Day or Night");

        if (yearsOfExperience < 0)
            throw new HospitalDataException("Years of experience must be >= 0");

        this.nurseName = nurseName;
        this.shift = shift;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getNurseName() { return nurseName; }
    public String getShift() { return shift; }
    public int getYearsOfExperience() { return yearsOfExperience; }

}
