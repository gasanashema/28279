package id_28279.q5;

import java.time.LocalDate;

public class Rental extends Customer {
    private LocalDate rentalDate;
    private LocalDate returnDate;
    private int rentalDays;

    public Rental(int id, LocalDate createdDate, LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  LocalDate rentalDate, LocalDate returnDate, int rentalDays) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber);

        if (rentalDate.isBefore(getCreatedDate()))
            throw new Exception("Rental cannot occur before company creation");
        if (returnDate.isBefore(rentalDate))
            throw new Exception("Return date cannot be before rental date");
        if (rentalDays <= 0) throw new Exception("Rental days must be > 0");

        this.rentalDate = rentalDate;
        this.returnDate = returnDate;
        this.rentalDays = rentalDays;
    }

    public LocalDate getRentalDate() { return rentalDate; }
    public LocalDate getReturnDate() { return returnDate; }
    public int getRentalDays() { return rentalDays; }
}
