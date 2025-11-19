package id_28279.q5;

import java.time.LocalDate;

public class Branch extends Company {
    private String branchName;
    private String locationCode;

    public Branch(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber);

        if (branchName.isEmpty()) throw new Exception("Branch name cannot be empty");
        if (locationCode.length() < 3) throw new Exception("Location code must have at least 3 characters");

        this.branchName = branchName;
        this.locationCode = locationCode;
    }

    public String getBranchName() { return branchName; }
    public String getLocationCode() { return locationCode; }
}
