package id_28279.q7;

public class Buyer extends Seller {
    private String buyerName;
    private String email;

    public Buyer(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String agencyName, String location, String agencyPhone,
                 String agentName, String agentEmail, String licenseNumber,
                 String propertyCode, String propertyType, double price,
                 String sellerName, String sellerPhone,
                 String buyerName, String email,
                 String existingAgentEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerPhone, existingAgentEmail, existingPhone);

        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid buyer email format");
        if (email.equals(agentEmail))
            throw new Exception("Buyer email cannot be same as agent email");

        this.buyerName = buyerName;
        this.email = email;
    }

    public String getBuyerName() { return buyerName; }
    public String getEmail() { return email; }
}
