package id_28279.q7;

public class Seller extends Property {
    private String sellerName;
    private String contactNumber;

    public Seller(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String agencyName, String location, String agencyPhone,
                  String agentName, String email, String licenseNumber,
                  String propertyCode, String propertyType, double price,
                  String sellerName, String contactNumber,
                  String existingEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, email, licenseNumber,
              propertyCode, propertyType, price, existingEmail);

        if (contactNumber.equals(existingPhone))
            throw new Exception("Seller phone cannot be same as agency phone");
        this.sellerName = sellerName;
        this.contactNumber = contactNumber;
    }

    public String getSellerName() { return sellerName; }
    public String getContactNumber() { return contactNumber; }
}
