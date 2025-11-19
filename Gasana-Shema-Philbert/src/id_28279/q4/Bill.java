package id_28279.q4;

public class Bill extends Payment {
    private double roomCharge;
    private double serviceCharge;
    private double totalBill;

    public Bill(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String hotelName, String address, String hotelPhone, String hotelEmail,
                int roomNumber, String roomType, double pricePerNight,
                String customerName, String customerEmail, String customerContact,
                java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                String serviceName, double serviceCost,
                String paymentMethod, java.time.LocalDate paymentDate,
                double roomCharge, double serviceCharge, double totalBill) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, customerContact,
              bookingDate, checkInDate, checkOutDate,
              serviceName, serviceCost,
              paymentMethod, paymentDate);

        if (roomCharge <= 0 || serviceCharge < 0 || totalBill <= 0)
            throw new Exception("Charges must be positive");

        this.roomCharge = roomCharge;
        this.serviceCharge = serviceCharge;
        this.totalBill = totalBill;
    }

    public double getRoomCharge() { return roomCharge; }
    public double getServiceCharge() { return serviceCharge; }
    public double getTotalBill() { return totalBill; }
}
