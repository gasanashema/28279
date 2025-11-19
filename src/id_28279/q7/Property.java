package id_28279.q7;

public class Property extends Agent {
    private String propertyCode;
    private String propertyType;
    private double price;

    public Property(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String agencyName, String location, String agencyPhone,
                    String agentName, String email, String licenseNumber,
                    String propertyCode, String propertyType, double price,
                    String existingEmail) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone, agentName, email, licenseNumber, existingEmail);
        if (price <= 0) throw new Exception("Price must be > 0");
        this.propertyCode = propertyCode;
        this.propertyType = propertyType;
        this.price = price;
    }

    public String getPropertyCode() { return propertyCode; }
    public String getPropertyType() { return propertyType; }
    public double getPrice() { return price; }
}
