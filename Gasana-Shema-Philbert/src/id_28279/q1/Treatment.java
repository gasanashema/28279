package id_28279.q1;

import java.time.LocalDate;

public class Treatment extends Admission {

    private String diagnosis;
    private String treatmentGiven;
    private double treatmentCost;

    public Treatment(int id, LocalDate createdDate, LocalDate updatedDate,
                     String hospitalName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String doctorName, String specialization, String doctorEmail, String phone,
                     String nurseName, String shift, int yearsOfExperience,
                     String patientName, int age, String gender, String contactNumber,
                     LocalDate admissionDate, String roomNumber, double roomCharges,
                     String diagnosis, String treatmentGiven, double treatmentCost)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges);

        if (diagnosis == null || diagnosis.isEmpty())
            throw new HospitalDataException("Diagnosis cannot be empty");

        if (treatmentGiven == null || treatmentGiven.isEmpty())
            throw new HospitalDataException("Treatment given cannot be empty");

        if (treatmentCost <= 0)
            throw new HospitalDataException("Treatment cost must be > 0");

        this.diagnosis = diagnosis;
        this.treatmentGiven = treatmentGiven;
        this.treatmentCost = treatmentCost;
    }

    public String getDiagnosis() { return diagnosis; }
    public String getTreatmentGiven() { return treatmentGiven; }
    public double getTreatmentCost() { return treatmentCost; }
}
