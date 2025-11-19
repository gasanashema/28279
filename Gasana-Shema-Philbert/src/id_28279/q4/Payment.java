package id_28279.q4;

import java.time.LocalDate;

public class Payment extends Service {
    private String paymentMethod;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hotelName, String address, String hotelPhone, String hotelEmail,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String customerContact,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
                   String serviceName, double serviceCost,
                   String paymentMethod, LocalDate paymentDate) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, customerContact,
              bookingDate, checkInDate, checkOutDate,
              serviceName, serviceCost);

        if (paymentMethod.isEmpty()) throw new Exception("Payment method cannot be empty");
        if (paymentDate == null) throw new Exception("Payment date cannot be null");

        this.paymentMethod = paymentMethod;
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() { return paymentMethod; }
    public java.time.LocalDate getPaymentDate() { return paymentDate; }
}
