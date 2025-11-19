package id_28279.q5;

import java.time.LocalDate;

public class Payment extends Charge {
    private String paymentMode;
    private String transactionId;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate,
                   String customerName, String licenseNumber, String contactNumber,
                   LocalDate rentalDate, LocalDate returnDate, int rentalDays,
                   double rentalCharge, double penaltyCharge,
                   String paymentMode, String transactionId) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge);

        if (paymentMode.isEmpty()) throw new Exception("Payment mode cannot be empty");
        if (transactionId.isEmpty()) throw new Exception("Transaction ID cannot be empty");

        this.paymentMode = paymentMode;
        this.transactionId = transactionId;
    }

    public String getPaymentMode() { return paymentMode; }
    public String getTransactionId() { return transactionId; }
}
