package id_28279.q10;

public class Customer {
    private String customerName, contactNumber, address;

    public Customer(String customerName, String contactNumber, String address) throws Exception {
        if (customerName.isEmpty() || contactNumber.isEmpty() || address.isEmpty())
            throw new Exception("Customer information cannot be empty");
        if (!contactNumber.matches("\\d{10}"))
            throw new Exception("Customer contact must be exactly 10 digits");
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public String getCustomerName() { return customerName; }
    public String getContactNumber() { return contactNumber; }
    public String getAddress() { return address; }
}
