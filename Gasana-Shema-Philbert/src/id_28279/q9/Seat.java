package id_28279.q9;

public class Seat extends Passenger {
    private String seatNumber;
    private String seatType;

    public Seat(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String airlineName, String address, String contactEmail,
                String flightNumber, String destination, java.time.LocalDateTime departureTime,
                String passengerName, String passportNumber, String nationality,
                String seatNumber, String seatType) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality);
        if (!seatType.equalsIgnoreCase("Economy") && !seatType.equalsIgnoreCase("Business"))
            throw new Exception("Seat type must be Economy or Business");
        this.seatNumber = seatNumber;
        this.seatType = seatType;
    }

    public String getSeatNumber() { return seatNumber; }
    public String getSeatType() { return seatType; }
}
