package id_28279.q9;

public class Baggage extends Ticket {
    private double baggageWeight;
    private double baggageFee;

    public Baggage(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String airlineName, String address, String contactEmail,
                   String flightNumber, String destination, java.time.LocalDateTime departureTime,
                   String passengerName, String passportNumber, String nationality,
                   String seatNumber, String seatType,
                   String ticketNumber, double price,
                   double baggageWeight, double baggageFee) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality,
              seatNumber, seatType, ticketNumber, price);
        if (baggageWeight < 0 || baggageFee < 0) throw new Exception("Baggage weight and fee cannot be negative");
        this.baggageWeight = baggageWeight;
        this.baggageFee = baggageFee;
    }

    public double getBaggageWeight() { return baggageWeight; }
    public double getBaggageFee() { return baggageFee; }
}
