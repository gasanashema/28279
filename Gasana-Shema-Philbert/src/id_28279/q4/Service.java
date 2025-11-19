package id_28279.q4;

public class Service extends Booking {
    private String serviceName;
    private double serviceCost;

    public Service(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String hotelName, String address, String hotelPhone, String hotelEmail,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String customerContact,
                   java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                   String serviceName, double serviceCost) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, customerContact,
              bookingDate, checkInDate, checkOutDate);

        if (serviceName.isEmpty()) throw new Exception("Service name cannot be empty");
        if (serviceCost <= 0) throw new Exception("Service cost must be > 0");

        this.serviceName = serviceName;
        this.serviceCost = serviceCost;
    }

    public String getServiceName() { return serviceName; }
    public double getServiceCost() { return serviceCost; }
}
