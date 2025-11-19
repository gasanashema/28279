package id_28279.q7;

import java.time.LocalDate;

public class Agreement extends Buyer {
    private LocalDate agreementDate;
    private String terms;

    public Agreement(int id, LocalDate createdDate, LocalDate updatedDate,
                     String agencyName, String location, String agencyPhone,
                     String agentName, String agentEmail, String licenseNumber,
                     String propertyCode, String propertyType, double price,
                     String sellerName, String sellerPhone,
                     String buyerName, String buyerEmail,
                     LocalDate agreementDate, String terms,
                     String existingAgentEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerPhone,
              buyerName, buyerEmail,
              existingAgentEmail, existingPhone);

        if (terms == null || terms.isEmpty())
            throw new Exception("Agreement terms cannot be empty");

        this.agreementDate = agreementDate;
        this.terms = terms;
    }

    public LocalDate getAgreementDate() { return agreementDate; }
    public String getTerms() { return terms; }
}
