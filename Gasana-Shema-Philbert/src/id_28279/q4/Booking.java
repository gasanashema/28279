package id_28279.q4;

import java.time.LocalDate;

public class Booking extends Customer {
    private LocalDate bookingDate;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public Booking(int id, LocalDate createdDate, LocalDate updatedDate,
                   String hotelName, String address, String hotelPhone, String hotelEmail,
                   int roomNumber, String roomType, double pricePerNight,
                   String customerName, String customerEmail, String customerContact,
                   LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
                roomNumber, roomType, pricePerNight, customerName, customerEmail, customerContact);

        if (bookingDate == null || checkInDate == null || checkOutDate == null)
            throw new Exception("Dates cannot be null");
        if (checkOutDate.isBefore(checkInDate)) throw new Exception("Check-out cannot be before check-in");

        this.bookingDate = bookingDate;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public LocalDate getBookingDate() { return bookingDate; }
    public LocalDate getCheckInDate() { return checkInDate; }
    public LocalDate getCheckOutDate() { return checkOutDate; }
}
