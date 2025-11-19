package id_28279.q9;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class TicketRecord extends Invoice {
    public TicketRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                        String airlineName, String address, String contactEmail,
                        String flightNumber, String destination, LocalDateTime departureTime,
                        String passengerName, String passportNumber, String nationality,
                        String seatNumber, String seatType,
                        String ticketNumber, double price,
                        double baggageWeight, double baggageFee,
                        LocalDate paymentDate, String paymentMode) throws Exception {
        super(id, createdDate, updatedDate, airlineName, address, contactEmail,
              flightNumber, destination, departureTime,
              passengerName, passportNumber, nationality,
              seatNumber, seatType,
              ticketNumber, price, baggageWeight, baggageFee, paymentDate, paymentMode);
    }

    public double generateInvoice() {
        return getPrice() + getBaggageFee();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0;
        LocalDate createdDate = null, updatedDate = null, paymentDate = null;
        LocalDateTime departureTime = null;
        String airlineName = "", address = "", contactEmail = "";
        String flightNumber = "", destination = "";
        String passengerName = "", passportNumber = "", nationality = "";
        String seatNumber = "", seatType = "";
        String ticketNumber = "", paymentMode = "";
        double price = 0, baggageWeight = 0, baggageFee = 0;

        System.out.println("========= AIRLINE TICKETING SYSTEM =========");

        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0) throw new Exception("ID must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
        }

        while (true) {
            try {
                System.out.print("Updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate))
                    throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            System.out.print("Airline name: ");
            airlineName = sc.nextLine().trim();
            if (!airlineName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        System.out.print("Address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("Contact email: ");
            contactEmail = sc.nextLine().trim();
            if (contactEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("Flight number: ");
            flightNumber = sc.nextLine().trim();
            if (!flightNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Destination: ");
            destination = sc.nextLine().trim();
            if (!destination.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Departure date & time (YYYY-MM-DD HH:MM): ");
                String dt = sc.nextLine().trim();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                departureTime = LocalDateTime.parse(dt, formatter);
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date-time format"); }
        }

        while (true) {
            System.out.print("Passenger name: ");
            passengerName = sc.nextLine().trim();
            if (!passengerName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Passport number: ");
            passportNumber = sc.nextLine().trim();
            if (!passportNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        System.out.print("Nationality: ");
        nationality = sc.nextLine().trim();

        while (true) {
            System.out.print("Seat number: ");
            seatNumber = sc.nextLine().trim();
            if (!seatNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Seat type (Economy/Business): ");
            seatType = sc.nextLine().trim();
            if (seatType.equalsIgnoreCase("Economy") || seatType.equalsIgnoreCase("Business")) break;
            System.out.println("ERROR: Must be Economy or Business");
        }

        while (true) {
            System.out.print("Ticket number: ");
            ticketNumber = sc.nextLine().trim();
            if (!ticketNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Ticket price: ");
                price = Double.parseDouble(sc.nextLine().trim());
                if (price <= 0) throw new Exception("Price must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Baggage weight: ");
                baggageWeight = Double.parseDouble(sc.nextLine().trim());
                if (baggageWeight < 0) throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Baggage fee: ");
                baggageFee = Double.parseDouble(sc.nextLine().trim());
                if (baggageFee < 0) throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Payment date (YYYY-MM-DD): ");
                paymentDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
        }

        while (true) {
            System.out.print("Payment mode: ");
            paymentMode = sc.nextLine().trim();
            if (!paymentMode.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        try {
            TicketRecord record = new TicketRecord(
                    id, createdDate, updatedDate,
                    airlineName, address, contactEmail,
                    flightNumber, destination, departureTime,
                    passengerName, passportNumber, nationality,
                    seatNumber, seatType,
                    ticketNumber, price,
                    baggageWeight, baggageFee,
                    paymentDate, paymentMode
            );

            System.out.println("\n========= TICKET RECORD =========");
            System.out.println("Airline: " + record.getAirlineName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("Contact Email: " + record.getContactEmail());
            System.out.println("Flight #: " + record.getFlightNumber());
            System.out.println("Destination: " + record.getDestination());
            System.out.println("Departure: " + record.getDepartureTime());
            System.out.println("Passenger: " + record.getPassengerName());
            System.out.println("Passport #: " + record.getPassportNumber());
            System.out.println("Nationality: " + record.getNationality());
            System.out.println("Seat #: " + record.getSeatNumber() + " | Type: " + record.getSeatType());
            System.out.println("Ticket #: " + record.getTicketNumber());
            System.out.println("Price: " + record.getPrice());
            System.out.println("Baggage weight: " + record.getBaggageWeight());
            System.out.println("Baggage fee: " + record.getBaggageFee());
            System.out.println("Payment Date: " + record.getPaymentDate());
            System.out.println("Payment Mode: " + record.getPaymentMode());
            System.out.println("Total Fare: " + record.generateInvoice());
            System.out.println("=================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
