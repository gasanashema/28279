package id_28279.q7;

public class Commission extends Payment {
    private double commissionRate;
    private double commissionAmount;

    public Commission(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                      String agencyName, String location, String agencyPhone,
                      String agentName, String agentEmail, String licenseNumber,
                      String propertyCode, String propertyType, double price,
                      String sellerName, String sellerPhone,
                      String buyerName, String buyerEmail,
                      java.time.LocalDate agreementDate, String terms,
                      double paymentAmount, java.time.LocalDate paymentDate,
                      double commissionRate, double commissionAmount,
                      String existingAgentEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerPhone,
              buyerName, buyerEmail,
              agreementDate, terms,
              paymentAmount, paymentDate,
              existingAgentEmail, existingPhone);

        if (commissionRate < 0)
            throw new Exception("Commission rate cannot be negative");

        this.commissionRate = commissionRate;
        this.commissionAmount = commissionAmount;
    }

    public double getCommissionRate() { return commissionRate; }
    public double getCommissionAmount() { return commissionAmount; }
}
