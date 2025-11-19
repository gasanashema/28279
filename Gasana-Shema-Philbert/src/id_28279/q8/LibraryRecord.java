package id_28279.q8;

import java.time.LocalDate;
import java.util.Scanner;

public final class LibraryRecord extends Record {

    public LibraryRecord(int id, LocalDate createdDate, LocalDate updatedDate,
            String libraryName, String location, String phoneNumber,
            String sectionName, String sectionCode,
            String title, String author, String ISBN,
            String memberName, int memberId, String contactNumber,
            LocalDate borrowDate, LocalDate returnDate,
            double fineAmount, int daysLate,
            LocalDate paymentDate, String paymentMode,
            double totalFine,
            String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate, fineAmount, daysLate,
                paymentDate, paymentMode, totalFine, existingPhone);
    }

    public double calculateFine() {
        return getFineAmount() * getDaysLate();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 0, memberId = 0, daysLate = 0;
        double fineAmount = 0, totalFine = 0;
        LocalDate createdDate = null, updatedDate = null, borrowDate = null, returnDate = null, paymentDate = null;
        String libraryName = "", location = "", phoneNumber = "";
        String sectionName = "", sectionCode = "";
        String title = "", author = "", ISBN = "";
        String memberName = "", contactNumber = "";
        String paymentMode = "";

        System.out.println("========= LIBRARY MANAGEMENT SYSTEM =========");

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
            System.out.print("Library name: ");
            libraryName = sc.nextLine().trim();
            if (!libraryName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        System.out.print("Location: ");
        location = sc.nextLine().trim();

        while (true) {
            System.out.print("Phone (10 digits): ");
            phoneNumber = sc.nextLine().trim();
            if (phoneNumber.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Invalid phone number");
        }

        while (true) {
            System.out.print("Section name: ");
            sectionName = sc.nextLine().trim();
            if (!sectionName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Section code: ");
            sectionCode = sc.nextLine().trim();
            if (sectionCode.length() >= 3)
                break;
            System.out.println("ERROR: Must be at least 3 chars");
        }

        while (true) {
            System.out.print("Book title: ");
            title = sc.nextLine().trim();
            if (!title.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("Author: ");
            author = sc.nextLine().trim();
            if (!author.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            System.out.print("ISBN (≥10 chars): ");
            ISBN = sc.nextLine().trim();
            if (ISBN.length() >= 10)
                break;
            System.out.println("ERROR: Must be ≥10 chars");
        }

        while (true) {
            System.out.print("Member name: ");
            memberName = sc.nextLine().trim();
            if (!memberName.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Member ID: ");
                memberId = Integer.parseInt(sc.nextLine().trim());
                if (memberId <= 0)
                    throw new Exception("Must be >0");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Contact number (10 digits): ");
            contactNumber = sc.nextLine().trim();
            if (contactNumber.matches("\\d{10}") && !contactNumber.equals(phoneNumber))
                break;
            System.out.println("ERROR: Invalid or duplicate phone number");
        }

        while (true) {
            try {
                System.out.print("Borrow date (YYYY-MM-DD): ");
                borrowDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date");
            }
        }

        while (true) {
            try {
                System.out.print("Return date (YYYY-MM-DD): ");
                returnDate = LocalDate.parse(sc.nextLine().trim());
                if (returnDate.isBefore(borrowDate))
                    throw new Exception("Return cannot be before borrow date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Fine amount: ");
                fineAmount = Double.parseDouble(sc.nextLine().trim());
                if (fineAmount < 0)
                    throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Days late: ");
                daysLate = Integer.parseInt(sc.nextLine().trim());
                if (daysLate < 0)
                    throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Payment date (YYYY-MM-DD): ");
                paymentDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date");
            }
        }

        while (true) {
            System.out.print("Payment mode: ");
            paymentMode = sc.nextLine().trim();
            if (!paymentMode.isEmpty())
                break;
            System.out.println("ERROR: Cannot be empty");
        }

        totalFine = fineAmount * daysLate;

        try {
            LibraryRecord record = new LibraryRecord(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                    sectionName, sectionCode, title, author, ISBN,
                    memberName, memberId, contactNumber,
                    borrowDate, returnDate, fineAmount, daysLate,
                    paymentDate, paymentMode, totalFine, phoneNumber);

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n========= LIBRARY RECORD =========");
            System.out.println("Library: " + record.getLibraryName() + " | Location: " + record.getLocation()
                    + " | Phone: " + record.getPhoneNumber());
            System.out.println("Section: " + record.getSectionName() + " | Code: " + record.getSectionCode());
            System.out.println(
                    "Book: " + record.getTitle() + " | Author: " + record.getAuthor() + " | ISBN: " + record.getISBN());
            System.out.println("Member: " + record.getMemberName() + " | ID: " + record.getMemberId() + " | Contact: "
                    + record.getContactNumber());
            System.out.println("Borrow Date: " + record.getBorrowDate() + " | Return Date: " + record.getReturnDate());
            System.out.println("Fine Amount: " + record.getFineAmount() + " | Days Late: " + record.getDaysLate());
            System.out
                    .println("Total Fine: " + record.getTotalFine() + " | Calculated Fine: " + record.calculateFine());
            System.out.println("Payment Date: " + record.getPaymentDate() + " | Mode: " + record.getPaymentMode());
            System.out.println("=================================");
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
