package id_28279.q8;

public class Library extends Entity {
    private String libraryName;
    private String location;
    private String phoneNumber;

    public Library(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber) throws Exception {
        super(id, createdDate, updatedDate);
        if (!phoneNumber.matches("\\d{10}")) throw new Exception("Invalid phone number");
        this.libraryName = libraryName;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public String getLibraryName() { return libraryName; }
    public String getLocation() { return location; }
    public String getPhoneNumber() { return phoneNumber; }
}
