package id_28279.q9;

public class Ticket extends Seat {
    private String ticketNumber;
    private double price;

    public Ticket(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, java.time.LocalDateTime departureTime,
                  String passengerName, String passportNumber, String nationality,
                  String seatNumber, String seatType,
                  String ticketNumber, double price) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality,
              seatNumber, seatType);
        if (price <= 0) throw new Exception("Price must be > 0");
        this.ticketNumber = ticketNumber;
        this.price = price;
    }

    public String getTicketNumber() { return ticketNumber; }
    public double getPrice() { return price; }
}
