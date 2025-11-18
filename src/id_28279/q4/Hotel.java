package id_28279.q4;

public class Hotel extends Entity {
    private String hotelName;
    private String address;
    private String phoneNumber;
    private String email;

    public Hotel(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String hotelName, String address, String phoneNumber, String email) throws Exception {
        super(id, createdDate, updatedDate);
        if (hotelName.isEmpty()) throw new Exception("Hotel name cannot be empty");
        if (!phoneNumber.matches("\\d{10}")) throw new Exception("Phone must be 10 digits");
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) throw new Exception("Invalid email format");

        this.hotelName = hotelName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getHotelName() { return hotelName; }
    public String getAddress() { return address; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
}
