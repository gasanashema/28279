package id_28279.q5;

import java.time.LocalDate;
import java.util.Scanner;

public final class RentalRecord extends Invoice {

    public RentalRecord(int id, LocalDate createdDate, LocalDate updatedDate,
            String companyName, String address, String phoneNumber,
            String branchName, String locationCode,
            String vehicleType, String registrationNumber, double dailyRate,
            String customerName, String licenseNumber, String contactNumber,
            LocalDate rentalDate, LocalDate returnDate, int rentalDays,
            double rentalCharge, double penaltyCharge,
            String paymentMode, String transactionId,
            double totalCharge) throws Exception {
        super(id, createdDate, updatedDate, companyName, address, phoneNumber, branchName, locationCode,
                vehicleType, registrationNumber, dailyRate, customerName, licenseNumber, contactNumber,
                rentalDate, returnDate, rentalDays, rentalCharge, penaltyCharge, paymentMode, transactionId,
                totalCharge);
    }

    public double calculateTotalCharge() {
        return getRentalCharge() + getPenaltyCharge();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0, rentalDays = 0;
        double dailyRate = 0, rentalCharge = 0, penaltyCharge = 0, totalCharge = 0;
        LocalDate createdDate = null, updatedDate = null, rentalDate = null, returnDate = null;
        String companyName = "", address = "", phoneNumber = "";
        String branchName = "", locationCode = "";
        String vehicleType = "", registrationNumber = "";
        String customerName = "", licenseNumber = "", contactNumber = "";
        String paymentMode = "", transactionId = "";

        System.out.println("========= VEHICLE RENTAL SYSTEM =========");

        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0)
                    throw new Exception("ID must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date");
            }
        }

        while (true) {
            try {
                System.out.print("Updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate))
                    throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Company name: ");
            companyName = sc.nextLine().trim();
            if (!companyName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        System.out.print("Address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("Phone (10 digits): ");
            phoneNumber = sc.nextLine().trim();
            if (phoneNumber.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Must be exactly 10 digits");
        }

        while (true) {
            System.out.print("Branch name: ");
            branchName = sc.nextLine().trim();
            if (!branchName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Location code: ");
            locationCode = sc.nextLine().trim();
            if (locationCode.length() >= 3)
                break;
            System.out.println("ERROR: Must be at least 3 chars");
        }

        while (true) {
            System.out.print("Vehicle type: ");
            vehicleType = sc.nextLine().trim();
            if (!vehicleType.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Registration number: ");
            registrationNumber = sc.nextLine().trim();
            if (!registrationNumber.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Daily rate: ");
                dailyRate = Double.parseDouble(sc.nextLine().trim());
                if (dailyRate <= 0)
                    throw new Exception("Daily rate must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Customer name: ");
            customerName = sc.nextLine().trim();
            if (!customerName.isEmpty() && !customerName.matches(".*\\d.*"))
                break;
            System.out.println("ERROR: Name cannot contain numbers or be empty");
        }

        while (true) {
            System.out.print("License number: ");
            licenseNumber = sc.nextLine().trim();
            if (!licenseNumber.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Customer contact (10 digits): ");
            contactNumber = sc.nextLine().trim();
            if (!contactNumber.matches("\\d{10}")) {
                System.out.println("ERROR: Must be exactly 10 digits");
            } else if (contactNumber.equals(phoneNumber)) {
                System.out.println("ERROR: Customer contact cannot be the same as company phone");
            } else {
                break;
            }
        }

        while (true) {
            try {
                System.out.print("Rental date (YYYY-MM-DD): ");
                rentalDate = LocalDate.parse(sc.nextLine().trim());
                if (rentalDate.isBefore(createdDate))
                    throw new Exception("Rental cannot be before company creation");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Return date (YYYY-MM-DD): ");
                returnDate = LocalDate.parse(sc.nextLine().trim());
                if (returnDate.isBefore(rentalDate))
                    throw new Exception("Return cannot be before rental date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Rental days: ");
                rentalDays = Integer.parseInt(sc.nextLine().trim());
                if (rentalDays <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Rental charge: ");
                rentalCharge = Double.parseDouble(sc.nextLine().trim());
                if (rentalCharge < 0)
                    throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Penalty charge: ");
                penaltyCharge = Double.parseDouble(sc.nextLine().trim());
                if (penaltyCharge < 0)
                    throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Payment mode: ");
            paymentMode = sc.nextLine().trim();
            if (!paymentMode.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Transaction ID: ");
            transactionId = sc.nextLine().trim();
            if (!transactionId.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        totalCharge = rentalCharge + penaltyCharge;

        try {
            RentalRecord record = new RentalRecord(
                    id, createdDate, updatedDate,
                    companyName, address, phoneNumber,
                    branchName, locationCode,
                    vehicleType, registrationNumber, dailyRate,
                    customerName, licenseNumber, contactNumber,
                    rentalDate, returnDate, rentalDays,
                    rentalCharge, penaltyCharge,
                    paymentMode, transactionId,
                    totalCharge);

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n========= VEHICLE RENTAL RECORD =========");
            System.out.println("Company: " + record.getCompanyName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("Phone: " + record.getPhoneNumber());

            System.out.println("\nBranch: " + record.getBranchName() + " | Location code: " + record.getLocationCode());
            System.out.println("Vehicle: " + record.getVehicleType() + " | Reg #: " + record.getRegistrationNumber());
            System.out.println("Daily rate: " + record.getDailyRate());

            System.out.println("\nCustomer: " + record.getCustomerName() + " | License: " + record.getLicenseNumber()
                    + " | Contact: " + record.getContactNumber());

            System.out.println("\nRental Date: " + record.getRentalDate() + " | Return Date: " + record.getReturnDate()
                    + " | Days: " + record.getRentalDays());

            System.out.println(
                    "\nRental Charge: " + record.getRentalCharge() + " | Penalty: " + record.getPenaltyCharge());
            System.out.println("Total Charge: " + record.getTotalCharge());
            System.out.println("Calculated Total: " + record.calculateTotalCharge());

            System.out.println(
                    "\nPayment Mode: " + record.getPaymentMode() + " | Transaction ID: " + record.getTransactionId());
            System.out.println("========================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }

}
