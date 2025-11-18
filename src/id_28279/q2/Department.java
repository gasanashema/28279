package id_28279.q2;

import java.time.LocalDate;

public class Department extends School {
    private String departmentName;
    private String departmentCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
            String schoolName, String address, String phoneNumber, String email,
            String departmentName, String departmentCode) throws Exception {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email);
        if (departmentCode.length() < 3 || !departmentCode.matches("[a-zA-Z0-9]+"))
            throw new Exception("Department code must be alphanumeric and ≥3 chars");

        this.departmentName = departmentName;
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }
}
