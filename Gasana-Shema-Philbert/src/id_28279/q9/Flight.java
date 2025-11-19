package id_28279.q9;

import java.time.LocalDateTime;

public class Flight extends Airline {
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;

    public Flight(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String airlineName, String address, String contactEmail,
                  String flightNumber, String destination, LocalDateTime departureTime) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail);
        if (flightNumber.isEmpty() || destination.isEmpty() || departureTime == null)
            throw new Exception("Flight number, destination, and departure time cannot be empty");
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public LocalDateTime getDepartureTime() { return departureTime; }
}
