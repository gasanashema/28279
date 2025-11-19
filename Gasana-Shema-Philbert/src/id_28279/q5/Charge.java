package id_28279.q5;

public class Charge extends Rental {
    private double rentalCharge;
    private double penaltyCharge;

    public Charge(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String companyName, String address, String phoneNumber,
                  String branchName, String locationCode,
                  String vehicleType, String registrationNumber, double dailyRate,
                  String customerName, String licenseNumber, String contactNumber,
                  java.time.LocalDate rentalDate, java.time.LocalDate returnDate, int rentalDays,
                  double rentalCharge, double penaltyCharge) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays);

        if (rentalCharge < 0) throw new Exception("Rental charge cannot be negative");
        if (penaltyCharge < 0) throw new Exception("Penalty charge cannot be negative");

        this.rentalCharge = rentalCharge;
        this.penaltyCharge = penaltyCharge;
    }

    public double getRentalCharge() { return rentalCharge; }
    public double getPenaltyCharge() { return penaltyCharge; }
}
