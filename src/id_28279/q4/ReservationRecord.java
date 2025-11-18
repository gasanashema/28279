package id_28279.q4;

import java.time.LocalDate;
import java.util.Scanner;

public final class ReservationRecord extends Feedback {
    public ReservationRecord(int id, LocalDate createdDate, LocalDate updatedDate,
            String hotelName, String address, String hotelPhone, String hotelEmail,
            int roomNumber, String roomType, double pricePerNight,
            String customerName, String customerEmail, String customerContact,
            LocalDate bookingDate, LocalDate checkInDate, LocalDate checkOutDate,
            String serviceName, double serviceCost,
            String paymentMethod, LocalDate paymentDate,
            double roomCharge, double serviceCharge, double totalBill,
            int rating, String comments) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
                roomNumber, roomType, pricePerNight,
                customerName, customerEmail, customerContact,
                bookingDate, checkInDate, checkOutDate,
                serviceName, serviceCost,
                paymentMethod, paymentDate,
                roomCharge, serviceCharge, totalBill,
                rating, comments);
    }

    public String generateBill() {
        return String.format("Room Charge: %.2f, Service Charge: %.2f, Total: %.2f",
                getRoomCharge(), getServiceCharge(), getTotalBill());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int id = 0, roomNumber = 0, rating = 0;
        double pricePerNight = 0, serviceCost = 0, roomCharge = 0, serviceCharge = 0, totalBill = 0;
        LocalDate createdDate = null, updatedDate = null, bookingDate = null, checkInDate = null, checkOutDate = null,
                paymentDate = null;
        String hotelName = "", address = "", hotelPhone = "", hotelEmail = "";
        String roomType = "";
        String customerName = "", customerEmail = "", customerContact = "";
        String serviceName = "";
        String paymentMethod = "";
        String comments = "";

        System.out.println("========= HOTEL RESERVATION SYSTEM =========");

        // ===== Entity Information =====
        while (true) {
            try {
                System.out.print("Enter ID: ");
                id = Integer.parseInt(sc.nextLine().trim());
                if (id <= 0)
                    throw new Exception("ID must be positive");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Enter created date (YYYY-MM-DD): ");
                createdDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date format");
            }
        }

        while (true) {
            try {
                System.out.print("Enter updated date (YYYY-MM-DD): ");
                updatedDate = LocalDate.parse(sc.nextLine().trim());
                if (updatedDate.isBefore(createdDate))
                    throw new Exception("Updated date cannot be before created date");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // ===== Hotel Information =====
        while (true) {
            System.out.print("Hotel name: ");
            hotelName = sc.nextLine().trim();
            if (!hotelName.isEmpty())
                break;
            System.out.println("ERROR: Hotel name cannot be empty");
        }

        System.out.print("Hotel address: ");
        address = sc.nextLine().trim();

        while (true) {
            System.out.print("Hotel phone: ");
            hotelPhone = sc.nextLine().trim();
            if (hotelPhone.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Phone must be exactly 10 digits");
        }

        while (true) {
            System.out.print("Hotel email: ");
            hotelEmail = sc.nextLine().trim();
            if (hotelEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email format");
        }

        // ===== Room Information =====
        while (true) {
            try {
                System.out.print("Room number: ");
                roomNumber = Integer.parseInt(sc.nextLine().trim());
                if (roomNumber <= 0)
                    throw new Exception("Room number must be positive");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Room type: ");
            roomType = sc.nextLine().trim();
            if (!roomType.isEmpty())
                break;
            System.out.println("ERROR: Room type cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Price per night: ");
                pricePerNight = Double.parseDouble(sc.nextLine().trim());
                if (pricePerNight <= 0)
                    throw new Exception("Price must be positive");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // ===== Customer Information =====
        while (true) {
            System.out.print("Customer name: ");
            customerName = sc.nextLine().trim();
            if (!customerName.matches(".*\\d.*") && !customerName.isEmpty())
                break;
            System.out.println("ERROR: Name cannot contain numbers or be empty");
        }

        while (true) {
            System.out.print("Customer email: ");
            customerEmail = sc.nextLine().trim();
            if (!customerEmail.equalsIgnoreCase(hotelEmail) &&
                    customerEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$"))
                break;
            System.out.println("ERROR: Invalid email or same as hotel email");
        }

        while (true) {
            System.out.print("Customer contact: ");
            customerContact = sc.nextLine().trim();
            if (!customerContact.equals(hotelPhone) && customerContact.matches("\\d{10}"))
                break;
            System.out.println("ERROR: Must be 10 digits and different from hotel phone");
        }

        // ===== Booking Information =====
        while (true) {
            try {
                System.out.print("Booking date (YYYY-MM-DD): ");
                bookingDate = LocalDate.parse(sc.nextLine().trim());
                if (!bookingDate.isBefore(createdDate))
                    break;
                else
                    throw new Exception("Booking cannot be before hotel creation date");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Check-in date (YYYY-MM-DD): ");
                checkInDate = LocalDate.parse(sc.nextLine().trim());
                break;
            } catch (Exception e) {
                System.out.println("ERROR: Invalid date");
            }
        }

        while (true) {
            try {
                System.out.print("Check-out date (YYYY-MM-DD): ");
                checkOutDate = LocalDate.parse(sc.nextLine().trim());
                if (!checkOutDate.isBefore(checkInDate))
                    break;
                throw new Exception("Check-out cannot be before check-in");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // ===== Service Information =====
        while (true) {
            System.out.print("Service name: ");
            serviceName = sc.nextLine().trim();
            if (!serviceName.isEmpty())
                break;
            System.out.println("ERROR: Service name cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Service cost: ");
                serviceCost = Double.parseDouble(sc.nextLine().trim());
                if (serviceCost <= 0)
                    throw new Exception("Service cost must be positive");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // ===== Payment Information =====
        while (true) {
            System.out.print("Payment method: ");
            paymentMethod = sc.nextLine().trim();
            if (!paymentMethod.isEmpty())
                break;
            System.out.println("ERROR: Payment method cannot be empty");
        }

        while (true) {
            try {
                System.out.print("Payment date (YYYY-MM-DD): ");
                paymentDate = LocalDate.parse(sc.nextLine().trim());
                if (!paymentDate.isBefore(bookingDate))
                    break;
                throw new Exception("Payment cannot be before booking date");
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // ===== Bill Information =====
        while (true) {
            try {
                System.out.print("Room charge: ");
                roomCharge = Double.parseDouble(sc.nextLine().trim());
                if (roomCharge <= 0)
                    throw new Exception("Room charge must be positive");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.print("Service charge: ");
                serviceCharge = Double.parseDouble(sc.nextLine().trim());
                if (serviceCharge < 0)
                    throw new Exception("Cannot be negative");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        // Auto-calculate total bill
        totalBill = roomCharge + serviceCharge;

        // ===== Feedback Information =====
        while (true) {
            try {
                System.out.print("Rating (1-5): ");
                rating = Integer.parseInt(sc.nextLine().trim());
                if (rating < 1 || rating > 5)
                    throw new Exception("Rating must be 1-5");
                break;
            } catch (Exception e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }

        while (true) {
            System.out.print("Comments: ");
            comments = sc.nextLine().trim();
            if (!comments.isEmpty())
                break;
            System.out.println("ERROR: Comments cannot be empty");
        }

        // ===== Create ReservationRecord =====
        try {
            ReservationRecord record = new ReservationRecord(
                    id, createdDate, updatedDate,
                    hotelName, address, hotelPhone, hotelEmail,
                    roomNumber, roomType, pricePerNight,
                    customerName, customerEmail, customerContact,
                    bookingDate, checkInDate, checkOutDate,
                    serviceName, serviceCost,
                    paymentMethod, paymentDate,
                    roomCharge, serviceCharge, totalBill,
                    rating, comments);

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n===================================");
            System.out.println("      HOTEL RESERVATION RECORD");
            System.out.println("===================================");
            System.out.println("\n===== HOTEL INFO =====");
            System.out.println("Hotel: " + record.getHotelName());
            System.out.println("Address: " + record.getAddress());
            System.out.println("Phone: " + record.getPhoneNumber());
            System.out.println("Email: " + record.getEmail());

            System.out.println("\n===== ROOM INFO =====");
            System.out.println("Room number: " + record.getRoomNumber());
            System.out.println("Room type: " + record.getRoomType());
            System.out.println("Price per night: " + record.getPricePerNight());

            System.out.println("\n===== CUSTOMER INFO =====");
            System.out.println("Customer: " + record.getCustomerName());
            System.out.println("Email: " + record.getCustomerEmail());
            System.out.println("Contact: " + record.getContactNumber());

            System.out.println("\n===== BOOKING INFO =====");
            System.out.println("Booking date: " + record.getBookingDate());
            System.out.println("Check-in: " + record.getCheckInDate());
            System.out.println("Check-out: " + record.getCheckOutDate());

            System.out.println("\n===== SERVICE INFO =====");
            System.out.println("Service: " + record.getServiceName());
            System.out.println("Service cost: " + record.getServiceCost());

            System.out.println("\n===== PAYMENT INFO =====");
            System.out.println("Payment method: " + record.getPaymentMethod());
            System.out.println("Payment date: " + record.getPaymentDate());

            System.out.println("\n===== BILL INFO =====");
            System.out.println("Room charge: " + record.getRoomCharge());
            System.out.println("Service charge: " + record.getServiceCharge());
            System.out.println("Total bill: " + record.getTotalBill());
            System.out.println("Generated bill: " + record.generateBill());

            System.out.println("\n===== FEEDBACK =====");
            System.out.println("Rating: " + record.getRating());
            System.out.println("Comments: " + record.getComments());

            System.out.println("===================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }

}
