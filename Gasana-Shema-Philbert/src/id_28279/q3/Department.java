package id_28279.q3;

import java.time.LocalDate;

public class Department extends Company {
    private String departmentName;
    private String departmentCode;

    public Department(int id, LocalDate createdDate, LocalDate updatedDate,
                      String companyName, String address, String phoneNumber, String email,
                      String departmentName, String departmentCode) {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, email);
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
