package id_28279.q4;

public class Customer extends Room {
    private String customerName;
    private String customerEmail;
    private String contactNumber;

    public Customer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String hotelName, String address, String hotelPhone, String hotelEmail,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String contactNumber) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail, roomNumber, roomType, pricePerNight);

        if (customerName.isEmpty() || customerName.matches(".*\\d.*")) throw new Exception("Invalid customer name");
        if (!customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) throw new Exception("Invalid email format");
        if (!contactNumber.matches("\\d{10}")) throw new Exception("Contact must be 10 digits");

        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getCustomerEmail() { return customerEmail; }
    public String getContactNumber() { return contactNumber; }
}
