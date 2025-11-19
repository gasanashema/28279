package id_28279.q3;

import java.time.LocalDate;
import java.util.Scanner;

public final class PayrollRecord extends Salary {
    public PayrollRecord(int id, LocalDate createdDate, LocalDate updatedDate,
            String companyName, String address, String phoneNumber, String email,
            String departmentName, String departmentCode,
            String managerName, String managerEmail, String managerPhone,
            String employeeName, int employeeId, String designation, String contactNumber,
            int totalDays, int presentDays, int leaveDays,
            double housingAllowance, double transportAllowance,
            double taxDeduction, double loanDeduction,
            double basicSalary, double grossSalary, double netSalary) throws Exception {

        super(id, createdDate, updatedDate,
                companyName, address, phoneNumber, email,
                departmentName, departmentCode,
                managerName, managerEmail, managerPhone,
                employeeName, employeeId, designation, contactNumber,
                totalDays, presentDays, leaveDays,
                housingAllowance, transportAllowance,
                taxDeduction, loanDeduction,
                basicSalary);

        this.setGrossSalary(grossSalary);
        this.setNetSalary(netSalary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0, employeeId = 0, totalDays = 0, presentDays = 0, leaveDays = 0;
        LocalDate createdDate = null, updatedDate = null;
        double housingAllowance = 0, transportAllowance = 0, taxDeduction = 0, loanDeduction = 0;
        double basicSalary = 0, grossSalary = 0, netSalary = 0;
        String companyName = "", address = "", phoneNumber = "", email = "";
        String departmentName = "", departmentCode = "";
        String managerName = "", managerEmail = "", managerPhone = "";
        String employeeName = "", designation = "", contactNumber = "";

        System.out.println("========= EMPLOYEE PAYROLL SYSTEM =========");

        while (true) {
            try {
                System.out.print("Enter ID (>0): ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0)
                    throw new Exception("ID must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date format");
            }
        }

        while (true) {
            try {
                System.out.print("Enter updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate))
                    throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Company name: ");
            companyName = sc.nextLine().trim();
            if (!companyName.isEmpty())
                break;
            System.out.println("ERROR: Company name cannot be empty");
        }

        System.out.print("Company address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("Company phone (10 digits): ");
            phoneNumber = sc.nextLine().trim();
            if (phoneNumber.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Must be 10 digits");
        }

        while (true) {
            System.out.print("Company email: ");
            email = sc.nextLine().trim();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("Department name: ");
            departmentName = sc.nextLine().trim();
            if (!departmentName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Department code (>=3 chars): ");
            departmentCode = sc.nextLine().trim();
            if (departmentCode.matches("[a-zA-Z0-9]{3,}"))
                break;
            System.out.println("ERROR: Must be >=3 alphanumeric characters");
        }

        while (true) {
            System.out.print("Manager name: ");
            managerName = sc.nextLine().trim();
            if (!managerName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Manager email: ");
            managerEmail = sc.nextLine().trim();
            if (managerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("Manager phone (10 digits): ");
            managerPhone = sc.nextLine().trim();
            if (managerPhone.matches("\\d{10}") && !managerPhone.equals(phoneNumber))
                break;
            System.out.println("ERROR: Must be 10 digits and different from company phone");
        }

        while (true) {
            System.out.print("Employee name: ");
            employeeName = sc.nextLine().trim();
            if (!employeeName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Employee ID (>0): ");
                employeeId = Integer.parseInt(sc.nextLine().trim());
                if (employeeId <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Designation: ");
            designation = sc.nextLine().trim();
            if (!designation.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Contact number (10 digits): ");
            contactNumber = sc.nextLine().trim();
            if (contactNumber.matches("\\d{10}") && !contactNumber.equals(managerPhone)
                    && !contactNumber.equals(phoneNumber))
                break;
            System.out.println("ERROR: Must be 10 digits and unique");
        }

        while (true) {
            try {
                System.out.print("Total days (>0): ");
                totalDays = Integer.parseInt(sc.nextLine().trim());
                if (totalDays <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Present days (>=0, <= total days): ");
                presentDays = Integer.parseInt(sc.nextLine().trim());
                if (presentDays < 0 || presentDays > totalDays)
                    throw new Exception("Invalid value");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Leave days (>=0): ");
                leaveDays = Integer.parseInt(sc.nextLine().trim());
                if (leaveDays < 0)
                    throw new Exception("Must be >=0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Housing allowance (>=0): ");
                housingAllowance = Double.parseDouble(sc.nextLine().trim());
                if (housingAllowance < 0)
                    throw new Exception("Must be >=0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Transport allowance (>=0): ");
                transportAllowance = Double.parseDouble(sc.nextLine().trim());
                if (transportAllowance < 0)
                    throw new Exception("Must be >=0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Tax deduction (>=0): ");
                taxDeduction = Double.parseDouble(sc.nextLine().trim());
                if (taxDeduction < 0)
                    throw new Exception("Must be >=0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Loan deduction (>=0): ");
                loanDeduction = Double.parseDouble(sc.nextLine().trim());
                if (loanDeduction < 0)
                    throw new Exception("Must be >=0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Basic salary (>0): ");
                basicSalary = Double.parseDouble(sc.nextLine().trim());
                if (basicSalary <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        grossSalary = basicSalary + housingAllowance + transportAllowance;
        netSalary = grossSalary - (taxDeduction + loanDeduction);

        try {
            PayrollRecord p = new PayrollRecord(id, createdDate, updatedDate,
                    companyName, address, phoneNumber, email,
                    departmentName, departmentCode,
                    managerName, managerEmail, managerPhone,
                    employeeName, employeeId, designation, contactNumber,
                    totalDays, presentDays, leaveDays,
                    housingAllowance, transportAllowance,
                    taxDeduction, loanDeduction,
                    basicSalary, grossSalary, netSalary);

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n===================================");
            System.out.println("        PAYROLL RECORD");
            System.out.println("===================================");

            System.out.println("Company: " + p.getCompanyName());
            System.out.println("Address: " + p.getAddress());
            System.out.println("Phone: " + p.getPhoneNumber());
            System.out.println("Email: " + p.getEmail());

            System.out.println("\nDepartment: " + p.getDepartmentName() + " (" + p.getDepartmentCode() + ")");
            System.out.println("Manager: " + p.getManagerName() + ", Email: " + p.getManagerEmail() + ", Phone: "
                    + p.getManagerPhone());

            System.out.println("\nEmployee: " + p.getEmployeeName() + ", ID: " + p.getEmployeeId());
            System.out.println("Designation: " + p.getDesignation() + ", Contact: " + p.getContactNumber());

            System.out.println("\nAttendance: Total=" + p.getTotalDays() + ", Present=" + p.getPresentDays()
                    + ", Leave=" + p.getLeaveDays());

            System.out.println(
                    "\nAllowances: Housing=" + p.getHousingAllowance() + ", Transport=" + p.getTransportAllowance());
            System.out.println("Deductions: Tax=" + p.getTaxDeduction() + ", Loan=" + p.getLoanDeduction());

            System.out.println("\nSalary: Basic=" + p.getBasicSalary() + ", Gross=" + p.getGrossSalary() + ", Net="
                    + p.getNetSalary());
            System.out.println("===================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
