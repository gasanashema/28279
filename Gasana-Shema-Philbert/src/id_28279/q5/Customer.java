package id_28279.q5;

import java.time.LocalDate;

public class Customer extends Vehicle {
    private String customerName;
    private String licenseNumber;
    private String contactNumber;

    public Customer(int id, LocalDate createdDate, LocalDate updatedDate,
                    String companyName, String address, String phoneNumber,
                    String branchName, String locationCode,
                    String vehicleType, String registrationNumber, double dailyRate,
                    String customerName, String licenseNumber, String contactNumber) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate);

        if (customerName.isEmpty() || customerName.matches(".*\\d.*"))
            throw new Exception("Customer name cannot be empty or contain numbers");
        if (licenseNumber.isEmpty()) throw new Exception("License number cannot be empty");
        if (!contactNumber.matches("\\d{10}")) throw new Exception("Contact number must be 10 digits");

        this.customerName = customerName;
        this.licenseNumber = licenseNumber;
        this.contactNumber = contactNumber;
    }

    public String getCustomerName() { return customerName; }
    public String getLicenseNumber() { return licenseNumber; }
    public String getContactNumber() { return contactNumber; }
}
