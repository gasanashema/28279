package id_28279.q5;

import java.time.LocalDate;

public class Vehicle extends Branch {
    private String vehicleType;
    private String registrationNumber;
    private double dailyRate;

    public Vehicle(int id, LocalDate createdDate, LocalDate updatedDate,
                   String companyName, String address, String phoneNumber,
                   String branchName, String locationCode,
                   String vehicleType, String registrationNumber, double dailyRate) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode);

        if (vehicleType.isEmpty()) throw new Exception("Vehicle type cannot be empty");
        if (registrationNumber.isEmpty()) throw new Exception("Registration number cannot be empty");
        if (dailyRate <= 0) throw new Exception("Daily rate must be > 0");

        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
        this.dailyRate = dailyRate;
    }

    public String getVehicleType() { return vehicleType; }
    public String getRegistrationNumber() { return registrationNumber; }
    public double getDailyRate() { return dailyRate; }
}
