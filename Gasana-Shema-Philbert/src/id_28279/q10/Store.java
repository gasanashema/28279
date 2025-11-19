package id_28279.q10;

public class Store extends Entity {
    private String storeName, address, email;

    public Store(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                 String storeName, String address, String email) throws Exception {
        super(id, createdDate, updatedDate);
        if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
            throw new Exception("Invalid email format");
        this.storeName = storeName;
        this.address = address;
        this.email = email;
    }

    public String getStoreName() { return storeName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
}
