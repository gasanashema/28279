package id_28279.q9;

public class Passenger extends Flight {
    private String passengerName;
    private String passportNumber;
    private String nationality;

    public Passenger(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                     String airlineName, String address, String contactEmail,
                     String flightNumber, String destination, java.time.LocalDateTime departureTime,
                     String passengerName, String passportNumber, String nationality) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail, flightNumber, destination, departureTime);
        if (passportNumber.isEmpty()) throw new Exception("Passport number cannot be empty");
        this.passengerName = passengerName;
        this.passportNumber = passportNumber;
        this.nationality = nationality;
    }

    public String getPassengerName() { return passengerName; }
    public String getPassportNumber() { return passportNumber; }
    public String getNationality() { return nationality; }
}
