package id_28279.q1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public final class HospitalRecord extends Bill {

    public HospitalRecord(int id, LocalDate createdDate, LocalDate updatedDate,
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
                admissionDate, roomNumber, roomCharges, diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost);
    }

    public void generateBill() {
        double total = getRoomCharges() + getTreatmentCost() + getDoctorFee() + getMedicineCost();
        setTotalBill(total);
    }

    public void displayRecord() {
        System.out.println("\n ------------- ------------- ------------\n");
        System.out.println("Student ID: 28279");
        System.out.println("\n===== Hospital Record =====\n");

        System.out.println("----- Hospital Information -----");
        System.out.println("Hospital Name: " + getHospitalName());
        System.out.println("Address: " + getAddress());
        System.out.println("Phone: " + getHospitalPhone());
        System.out.println("Email: " + getHospitalEmail());

        System.out.println("\n----- Department Information -----\n");
        System.out.println("Department Name: " + getDepartmentName());
        System.out.println("Department Code: " + getDepartmentCode());

        System.out.println("\n----- Doctor Information -----\n");
        System.out.println("Doctor Name: " + getDoctorName());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("Email: " + getDoctorEmail());
        System.out.println("Phone: " + getDoctorPhone());

        System.out.println("\n----- Nurse Information -----\n");
        System.out.println("Nurse Name: " + getNurseName());
        System.out.println("Shift: " + getShift());
        System.out.println("Years of Experience: " + getYearsOfExperience());

        System.out.println("\n----- Patient Information -----\n");
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Contact: " + getContactNumber());
        System.out.println("Admission Date: " + getAdmissionDate());
        System.out.println("Room Number: " + getRoomNumber());

        System.out.println("\n----- Treatment & Billing -----\n");
        System.out.println("Room Charges: " + getRoomCharges());
        System.out.println("Diagnosis: " + getDiagnosis());
        System.out.println("Treatment Given: " + getTreatmentGiven());
        System.out.println("Treatment Cost: " + getTreatmentCost());
        System.out.println("Doctor Fee: " + getDoctorFee());
        System.out.println("Medicine Cost: " + getMedicineCost());
        System.out.println("TOTAL BILL: " + getTotalBill());

        System.out.println("\n------------- ------------ -------------");
    }

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int id = 0, yearsExp = 0, age = 0;
    LocalDate createdDate = null, updatedDate = null, admissionDate = null;
    String hospitalName = "", address = "", hospitalPhone = "", hospitalEmail = "";
    String deptName = "", deptCode = "";
    String doctorName = "", specialization = "", doctorEmail = "", doctorPhone = "";
    String nurseName = "", shift = "";
    String patientName = "", gender = "", patientContact = "";
    String roomNumber = "", diagnosis = "", treatmentGiven = "";
    double roomCharges = 0, treatmentCost = 0, doctorFee = 0, medicineCost = 0;

    System.out.println("=== Hospital Management System ===");

    System.out.println("\n---- Hospital Information ----\n");
    while (true) {
        try {
            System.out.print("Enter ID (must be > 0): ");
            id = Integer.parseInt(sc.nextLine().trim());
            if (id <= 0)
                throw new NumberFormatException("ID must be greater than 0.");
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    while (true) {
        try {
            System.out.print("Enter created date (YYYY-MM-DD): ");
            createdDate = LocalDate.parse(sc.nextLine().trim());
            break;
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: Invalid date format, use YYYY-MM-DD");
        }
    }

    while (true) {
        try {
            System.out.print("Enter updated date (YYYY-MM-DD): ");
            updatedDate = LocalDate.parse(sc.nextLine().trim());
            if (updatedDate.isBefore(createdDate))
                throw new DateTimeException("Updated date cannot be before created date.");
            break;
        } catch (DateTimeException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    while (true) {
        System.out.print("Hospital name: ");
        hospitalName = sc.nextLine().trim();
        if (hospitalName.matches("[a-zA-Z ]+"))
            break;
        System.out.println("ERROR: Hospital name can only contain letters and spaces.");
    }

    System.out.print("Hospital address: ");
    address = sc.nextLine().trim();

    while (true) {
        System.out.print("Hospital phone (10 digits): ");
        hospitalPhone = sc.nextLine().trim();
        if (!hospitalPhone.matches("\\d{10}")) {
            System.out.println("ERROR: Phone must be exactly 10 digits.");
        } else if (hospitalPhone.equals(doctorPhone) || hospitalPhone.equals(patientContact)) {
            System.out.println("ERROR: Hospital phone cannot be same as doctor or patient.");
        } else break;
    }

    while (true) {
        System.out.print("Hospital email: ");
        hospitalEmail = sc.nextLine().trim();
        if (!hospitalEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("ERROR: Invalid email format.");
        } else if (hospitalEmail.equals(doctorEmail) || hospitalEmail.equals(patientContact)) {
            System.out.println("ERROR: Hospital email cannot be same as doctor or patient.");
        } else break;
    }

    System.out.println("\n---- Department Information ----\n");
    while (true) {
        System.out.print("Department name: ");
        deptName = sc.nextLine().trim();
        if (deptName.matches("[a-zA-Z ]+"))
            break;
        System.out.println("ERROR: Department name can only contain letters and spaces.");
    }

    while (true) {
        System.out.print("Department code: ");
        deptCode = sc.nextLine().trim();
        if (!deptCode.matches("\\d+"))
            break;
        System.out.println("ERROR: Department code cannot be numbers only.");
    }

    System.out.println("\n---- Doctor Information ----\n");
    while (true) {
        System.out.print("Doctor name: ");
        doctorName = sc.nextLine().trim();
        if (doctorName.matches("[a-zA-Z ]+"))
            break;
        System.out.println("ERROR: Doctor name can only contain letters and spaces.");
    }

    while (true) {
        System.out.print("Doctor specialization: ");
        specialization = sc.nextLine().trim();
        if (!specialization.matches("\\d+"))
            break;
        System.out.println("ERROR: Specialization cannot be numbers only.");
    }

    while (true) {
        System.out.print("Doctor email: ");
        doctorEmail = sc.nextLine().trim();
        if (!doctorEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) {
            System.out.println("ERROR: Invalid email format.");
        } else if (doctorEmail.equals(hospitalEmail) || doctorEmail.equals(patientContact)) {
            System.out.println("ERROR: Doctor email cannot be same as hospital or patient.");
        } else break;
    }

    while (true) {
        System.out.print("Doctor phone (10 digits): ");
        doctorPhone = sc.nextLine().trim();
        if (!doctorPhone.matches("\\d{10}")) {
            System.out.println("ERROR: Phone must be exactly 10 digits.");
        } else if (doctorPhone.equals(hospitalPhone) || doctorPhone.equals(patientContact)) {
            System.out.println("ERROR: Doctor phone cannot be same as hospital or patient.");
        } else break;
    }

    while (true) {
        System.out.print("Nurse name: ");
        nurseName = sc.nextLine().trim();
        if (nurseName.matches("[a-zA-Z ]+"))
            break;
        System.out.println("ERROR: Nurse name can only contain letters and spaces.");
    }

    while (true) {
        System.out.print("Shift (Day/Night): ");
        shift = sc.nextLine().trim();
        if (shift.equalsIgnoreCase("Day") || shift.equalsIgnoreCase("Night"))
            break;
        System.out.println("ERROR: Shift must be 'Day' or 'Night'.");
    }

    while (true) {
        try {
            System.out.print("Years of experience: ");
            yearsExp = Integer.parseInt(sc.nextLine().trim());
            if (yearsExp < 0)
                throw new NumberFormatException("Years of experience cannot be negative.");
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    System.out.println("\n---- Patient Information ----\n");
    while (true) {
        System.out.print("Patient name: ");
        patientName = sc.nextLine().trim();
        if (patientName.matches("[a-zA-Z ]+"))
            break;
        System.out.println("ERROR: Patient name can only contain letters and spaces.");
    }

    while (true) {
        try {
            System.out.print("Patient age (must be > 0): ");
            age = Integer.parseInt(sc.nextLine().trim());
            if (age <= 0)
                throw new NumberFormatException("Age must be greater than 0.");
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    while (true) {
        System.out.print("Patient gender (Male/Female or M/F): ");
        String input = sc.nextLine().trim().toLowerCase();
        if (input.equals("male") || input.equals("m")) {
            gender = "Male";
            break;
        } else if (input.equals("female") || input.equals("f")) {
            gender = "Female";
            break;
        } else {
            System.out.println("ERROR: Gender must be 'Male', 'Female', 'M' or 'F'.");
        }
    }

    while (true) {
        System.out.print("Patient contact (10 digits): ");
        patientContact = sc.nextLine().trim();
        if (!patientContact.matches("\\d{10}")) {
            System.out.println("ERROR: Phone must be exactly 10 digits.");
        } else if (patientContact.equals(hospitalPhone) || patientContact.equals(doctorPhone)) {
            System.out.println("ERROR: Patient phone cannot be same as hospital or doctor.");
        } else break;
    }

    while (true) {
        try {
            System.out.print("Admission date (YYYY-MM-DD): ");
            admissionDate = LocalDate.parse(sc.nextLine().trim());
            break;
        } catch (DateTimeParseException e) {
            System.out.println("ERROR: Invalid date format, use YYYY-MM-DD");
        }
    }

    System.out.println("\n---- Room and Treatment Details ----\n");
    while (true) {
        System.out.print("Room number: ");
        roomNumber = sc.nextLine().trim();
        if (!roomNumber.isEmpty())
            break;
        System.out.println("ERROR: Room number cannot be empty.");
    }

    while (true) {
        try {
            System.out.print("Room charges: ");
            roomCharges = Double.parseDouble(sc.nextLine().trim());
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid number.");
        }
    }

    while (true) {
        System.out.print("Diagnosis: ");
        diagnosis = sc.nextLine().trim();
        if (!diagnosis.isEmpty())
            break;
        System.out.println("ERROR: Diagnosis cannot be empty.");
    }

    while (true) {
        System.out.print("Treatment given: ");
        treatmentGiven = sc.nextLine().trim();
        if (!treatmentGiven.isEmpty())
            break;
        System.out.println("ERROR: Treatment cannot be empty.");
    }

    while (true) {
        try {
            System.out.print("Treatment cost: ");
            treatmentCost = Double.parseDouble(sc.nextLine().trim());
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid number.");
        }
    }

    while (true) {
        try {
            System.out.print("Doctor fee: ");
            doctorFee = Double.parseDouble(sc.nextLine().trim());
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid number.");
        }
    }

    while (true) {
        try {
            System.out.print("Medicine cost: ");
            medicineCost = Double.parseDouble(sc.nextLine().trim());
            break;
        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid number.");
        }
    }

    try {
        HospitalRecord record = new HospitalRecord(
                id, createdDate, updatedDate,
                hospitalName, address, hospitalPhone, hospitalEmail,
                deptName, deptCode,
                doctorName, specialization, doctorEmail, doctorPhone,
                nurseName, shift, yearsExp,
                patientName, age, gender, patientContact,
                admissionDate, roomNumber, roomCharges,
                diagnosis, treatmentGiven, treatmentCost,
                doctorFee, medicineCost);
        record.generateBill();
        record.displayRecord();
    } catch (HospitalDataException e) {
        System.out.println("ERROR: " + e.getMessage());
    }

    sc.close();
}

}
