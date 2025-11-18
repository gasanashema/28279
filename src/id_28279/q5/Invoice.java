package id_28279.q5;

public class Invoice extends Payment {
    private double totalCharge;

    public Invoice(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   java.time.LocalDate rentalDate, java.time.LocalDate returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId,
                   double totalCharge) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId);

        if (totalCharge <= 0) throw new Exception("Total charge must be > 0");
        this.totalCharge = totalCharge;
    }

    public double getTotalCharge() { return totalCharge; }
}
