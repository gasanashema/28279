package id_28279.q3;

import java.time.LocalDate;

public class Deduction extends Allowance {
    private double taxDeduction;
    private double loanDeduction;

    public Deduction(int id, LocalDate createdDate, LocalDate updatedDate,
                     String companyName, String address, String phoneNumber, String email,
                     String departmentName, String departmentCode,
                     String managerName, String managerEmail, String managerPhone,
                     String employeeName, int employeeId, String designation, String contactNumber,
                     int totalDays, int presentDays, int leaveDays,
                     double housingAllowance, double transportAllowance,
                     double taxDeduction, double loanDeduction) {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance);

        this.taxDeduction = taxDeduction;
        this.loanDeduction = loanDeduction;
    }

    public double getTaxDeduction() {
        return taxDeduction;
    }

    public double getLoanDeduction() {
        return loanDeduction;
    }

    public double getTotalDeduction() {
        return taxDeduction + loanDeduction;
    }
}
