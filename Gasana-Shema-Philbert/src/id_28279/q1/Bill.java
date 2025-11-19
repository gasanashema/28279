package id_28279.q1;

import java.time.LocalDate;

public class Bill extends Treatment {

    private double doctorFee;
    private double medicineCost;
    private double totalBill;

    public Bill(int id, LocalDate createdDate, LocalDate updatedDate,
                String hospitalName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String doctorName, String specialization, String doctorEmail, String phone,
                String nurseName, String shift, int yearsOfExperience,
                String patientName, int age, String gender, String contactNumber,
                LocalDate admissionDate, String roomNumber, double roomCharges,
                String diagnosis, String treatmentGiven, double treatmentCost,
                double doctorFee, double medicineCost)
            throws HospitalDataException {

        super(id, createdDate, updatedDate, hospitalName, address, phoneNumber, email,
                departmentName, departmentCode, doctorName, specialization, doctorEmail, phone,
                nurseName, shift, yearsOfExperience, patientName, age, gender, contactNumber,
                admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost);

        if (doctorFee <= 0)
            throw new HospitalDataException("Doctor fee must be > 0");

        if (medicineCost <= 0)
            throw new HospitalDataException("Medicine cost must be > 0");

        this.doctorFee = doctorFee;
        this.medicineCost = medicineCost;
    }

    public double getDoctorFee() { return doctorFee; }
    public double getMedicineCost() { return medicineCost; }

    protected void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public double getTotalBill() { return totalBill; }
}
