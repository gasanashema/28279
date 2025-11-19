package id_28279.q7;

import java.time.LocalDate;

public class Payment extends Agreement {
    private double paymentAmount;
    private LocalDate paymentDate;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String agencyName, String location, String agencyPhone,
                   String agentName, String agentEmail, String licenseNumber,
                   String propertyCode, String propertyType, double price,
                   String sellerName, String sellerPhone,
                   String buyerName, String buyerEmail,
                   LocalDate agreementDate, String terms,
                   double paymentAmount, LocalDate paymentDate,
                   String existingAgentEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerPhone,
              buyerName, buyerEmail,
              agreementDate, terms,
              existingAgentEmail, existingPhone);

        if (paymentAmount <= 0)
            throw new Exception("Payment amount must be > 0");

        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
    }

    public double getPaymentAmount() { return paymentAmount; }
    public LocalDate getPaymentDate() { return paymentDate; }
}
