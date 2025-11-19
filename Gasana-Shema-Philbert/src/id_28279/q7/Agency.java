package id_28279.q7;

public class Agency extends Entity {
    private String agencyName;
    private String location;
    private String phoneNumber;

    public Agency(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String agencyName, String location, String phoneNumber) throws Exception {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new Exception("Agency phone must be 10 digits");
        this.agencyName = agencyName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getAgencyName() { return agencyName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
