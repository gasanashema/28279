package id_28279.q3;

import java.time.LocalDate;

public class Salary extends Deduction {
    private double basicSalary;
    private double grossSalary;
    private double netSalary;

    public Salary(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String managerName, String managerEmail, String managerPhone,
                  String employeeName, int employeeId, String designation, String contactNumber,
                  int totalDays, int presentDays, int leaveDays,
                  double housingAllowance, double transportAllowance,
                  double taxDeduction, double loanDeduction,
                  double basicSalary) {

        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email,
                departmentName, departmentCode, managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction);

        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
}
