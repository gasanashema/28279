package id_28279.q6;

import java.time.LocalDate;
import java.util.Scanner;

public final class AccountRecord extends Loan {

    public AccountRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                          String bankName, String branchCode, String address, String bankPhone,
                          String accountNumber, String accountType, double balance,
                          String customerName, String email, String phoneNumber,
                          String transactionId, String transactionType, double transactionAmount,
                          double loanAmount, double interestRate, int duration) throws Exception {
        super(id, createdDate, updatedDate,
                bankName, branchCode, address, bankPhone,
                accountNumber, accountType, balance,
                customerName, email, phoneNumber,
                transactionId, transactionType, transactionAmount,
                loanAmount, interestRate, duration);

        if (phoneNumber.equals(bankPhone))
            throw new Exception("Customer phone cannot be the same as bank phone");
    }

    public double calculateInterest() {
        return (getLoanAmount() * getInterestRate() * getDuration()) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0, duration = 0;
        double balance = 0, transactionAmount = 0, loanAmount = 0, interestRate = 0;
        LocalDate createdDate = null, updatedDate = null;
        String bankName = "", branchCode = "", address = "", bankPhone = "";
        String accountNumber = "", accountType = "";
        String customerName = "", email = "", phoneNumber = "";
        String transactionId = "", transactionType = "";

        System.out.println("========= BANKING SYSTEM =========");

        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0) throw new Exception("ID must be >0");
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
            System.out.print("Bank name: ");
            bankName = sc.nextLine().trim();
            if (!bankName.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Branch code: ");
            branchCode = sc.nextLine().trim();
            if (branchCode.length() >= 3) break;
            System.out.println("ERROR: Must be at least 3 characters");
        }

        System.out.print("Address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("Bank phone (10 digits): ");
            bankPhone = sc.nextLine().trim();
            if (bankPhone.matches("\\d{10}")) break;
            System.out.println("ERROR: Must be 10 digits");
        }

        while (true) {
            System.out.print("Account number: ");
            accountNumber = sc.nextLine().trim();
            if (!accountNumber.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Account type: ");
            accountType = sc.nextLine().trim();
            if (!accountType.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Balance: ");
                balance = Double.parseDouble(sc.nextLine().trim());
                if (balance < 0) throw new Exception("Balance cannot be negative");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            System.out.print("Customer name: ");
            customerName = sc.nextLine().trim();
            if (!customerName.isEmpty() && !customerName.matches(".*\\d.*")) break;
            System.out.println("ERROR: Name cannot be empty or contain numbers");
        }

        while (true) {
            System.out.print("Email: ");
            email = sc.nextLine().trim();
            if (email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) break;
            System.out.println("ERROR: Invalid email format");
        }

        while (true) {
            System.out.print("Phone (10 digits, different from bank): ");
            phoneNumber = sc.nextLine().trim();
            if (phoneNumber.matches("\\d{10}") && !phoneNumber.equals(bankPhone)) break;
            System.out.println("ERROR: Must be 10 digits and different from bank phone");
        }

        while (true) {
            System.out.print("Transaction ID: ");
            transactionId = sc.nextLine().trim();
            if (!transactionId.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Transaction type: ");
            transactionType = sc.nextLine().trim();
            if (!transactionType.isEmpty()) break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Transaction amount: ");
                transactionAmount = Double.parseDouble(sc.nextLine().trim());
                if (transactionAmount <= 0) throw new Exception("Amount must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Loan amount: ");
                loanAmount = Double.parseDouble(sc.nextLine().trim());
                if (loanAmount <= 0) throw new Exception("Loan must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Interest rate (%): ");
                interestRate = Double.parseDouble(sc.nextLine().trim());
                if (interestRate <= 0) throw new Exception("Interest rate must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        while (true) {
            try {
                System.out.print("Duration (years): ");
                duration = Integer.parseInt(sc.nextLine().trim());
                if (duration <= 0) throw new Exception("Duration must be >0");
                break;
            } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
        }

        try {
            AccountRecord record = new AccountRecord(
                    id, createdDate, updatedDate,
                    bankName, branchCode, address, bankPhone,
                    accountNumber, accountType, balance,
                    customerName, email, phoneNumber,
                    transactionId, transactionType, transactionAmount,
                    loanAmount, interestRate, duration
            );

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n========= BANKING RECORD =========");
            System.out.println("Bank: " + bankName + " | Branch: " + branchCode + " | Address: " + address + " | Phone: " + bankPhone);
            System.out.println("Account: " + accountNumber + " | Type: " + accountType + " | Balance: " + balance);
            System.out.println("Customer: " + customerName + " | Email: " + email + " | Phone: " + phoneNumber);
            System.out.println("Transaction: " + transactionId + " | Type: " + transactionType + " | Amount: " + transactionAmount);
            System.out.println("Loan: " + loanAmount + " | Interest rate: " + interestRate + "% | Duration: " + duration + " years");
            System.out.println("Calculated Interest: " + record.calculateInterest());
            System.out.println("=================================");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
