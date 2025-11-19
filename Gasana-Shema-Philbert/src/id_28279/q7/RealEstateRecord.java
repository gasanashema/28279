package id_28279.q7;

import java.time.LocalDate;
import java.util.Scanner;

public final class RealEstateRecord extends Commission {

    public RealEstateRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                            String agencyName, String location, String agencyPhone,
                            String agentName, String agentEmail, String licenseNumber,
                            String propertyCode, String propertyType, double price,
                            String sellerName, String sellerPhone,
                            String buyerName, String buyerEmail,
                            LocalDate agreementDate, String terms,
                            double paymentAmount, LocalDate paymentDate,
                            double commissionRate, double commissionAmount,
                            String existingAgentEmail, String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, agencyName, location, agencyPhone,
              agentName, agentEmail, licenseNumber,
              propertyCode, propertyType, price,
              sellerName, sellerPhone,
              buyerName, buyerEmail,
              agreementDate, terms,
              paymentAmount, paymentDate,
              commissionRate, commissionAmount,
              existingAgentEmail, existingPhone);
    }

    public double calculateCommission() {
        return getPrice() * getCommissionRate() / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0;
        double price = 0, paymentAmount = 0, commissionRate = 0, commissionAmount = 0;
        LocalDate createdDate = null, updatedDate = null, agreementDate = null, paymentDate = null;
        String agencyName = "", location = "", agencyPhone = "";
        String agentName = "", agentEmail = "", licenseNumber = "";
        String propertyCode = "", propertyType = "";
        String sellerName = "", sellerPhone = "";
        String buyerName = "", buyerEmail = "";
        String terms = "";

        System.out.println("========= REAL ESTATE MANAGEMENT SYSTEM =========");

        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0) throw new Exception("ID must be > 0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
        }

        while (true) {
            try {
                System.out.print("Updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate)) throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            System.out.print("Agency name: ");
            agencyName = sc.nextLine().trim();
            if (!agencyName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        System.out.print("Location: ");
        location = sc.nextLine().trim();

        while (true) {
            System.out.print("Agency phone (10 digits): ");
            agencyPhone = sc.nextLine().trim();
            if (agencyPhone.matches("\\d{10}")) break;
            System.out.println("ERROR: Must be 10 digits");
        }

        while (true) {
            System.out.print("Agent name: ");
            agentName = sc.nextLine().trim();
            if (!agentName.isEmpty() && !agentName.matches(".*\\d.*")) break;
            System.out.println("ERROR: Invalid agent name");
        }

        while (true) {
            System.out.print("Agent email: ");
            agentEmail = sc.nextLine().trim();
            if (agentEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("License number: ");
            licenseNumber = sc.nextLine().trim();
            if (!licenseNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Property code: ");
            propertyCode = sc.nextLine().trim();
            if (!propertyCode.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Property type: ");
            propertyType = sc.nextLine().trim();
            if (!propertyType.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Price: ");
                price = Double.parseDouble(sc.nextLine().trim());
                if (price <= 0) throw new Exception("Price must be > 0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            System.out.print("Seller name: ");
            sellerName = sc.nextLine().trim();
            if (!sellerName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Seller phone (10 digits): ");
            sellerPhone = sc.nextLine().trim();
            if (!sellerPhone.equals(agencyPhone) && sellerPhone.matches("\\d{10}")) break;
            System.out.println("ERROR: Invalid or same as agency phone");
        }

        while (true) {
            System.out.print("Buyer name: ");
            buyerName = sc.nextLine().trim();
            if (!buyerName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Buyer email: ");
            buyerEmail = sc.nextLine().trim();
            if (buyerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$") && !buyerEmail.equals(agentEmail)) break;
            System.out.println("ERROR: Invalid email or same as agent");
        }

        while (true) {
            try {
                System.out.print("Agreement date (YYYY-MM-DD): ");
                agreementDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
        }

        while (true) {
            System.out.print("Agreement terms: ");
            terms = sc.nextLine().trim();
            if (!terms.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Payment amount: ");
                paymentAmount = Double.parseDouble(sc.nextLine().trim());
                if (paymentAmount <= 0) throw new Exception("Payment must be > 0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Payment date (YYYY-MM-DD): ");
                paymentDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
        }

        while (true) {
            try {
                System.out.print("Commission rate: ");
                commissionRate = Double.parseDouble(sc.nextLine().trim());
                if (commissionRate < 0) throw new Exception("Rate cannot be negative");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        commissionAmount = price * commissionRate / 100;

        try {
            RealEstateRecord record = new RealEstateRecord(id, createdDate, updatedDate,
                    agencyName, location, agencyPhone,
                    agentName, agentEmail, licenseNumber,
                    propertyCode, propertyType, price,
                    sellerName, sellerPhone,
                    buyerName, buyerEmail,
                    agreementDate, terms,
                    paymentAmount, paymentDate,
                    commissionRate, commissionAmount,
                    agentEmail, agencyPhone);

            System.out.println("\n========= REAL ESTATE RECORD =========");
            System.out.println("Agency: " + record.getAgencyName());
            System.out.println("Location: " + record.getLocation());
            System.out.println("Agency Phone: " + record.getPhoneNumber());
            System.out.println("\nAgent: " + record.getAgentName() + " | Email: " + record.getEmail() + " | License: " + record.getLicenseNumber());
            System.out.println("\nProperty: " + record.getPropertyCode() + " | Type: " + record.getPropertyType() + " | Price: " + record.getPrice());
            System.out.println("\nSeller: " + record.getSellerName() + " | Contact: " + record.getContactNumber());
            System.out.println("\nBuyer: " + record.getBuyerName() + " | Email: " + record.getEmail());
            System.out.println("\nAgreement Date: " + record.getAgreementDate() + " | Terms: " + record.getTerms());
            System.out.println("\nPayment Amount: " + record.getPaymentAmount() + " | Payment Date: " + record.getPaymentDate());
            System.out.println("Commission Rate: " + record.getCommissionRate() + "% | Commission Amount: " + record.getCommissionAmount());
            System.out.println("Calculated Commission: " + record.calculateCommission());
            System.out.println("========================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
