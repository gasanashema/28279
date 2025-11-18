package id_28279.q4;

public class Feedback extends Bill {
    private int rating;
    private String comments;

    public Feedback(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                    String hotelName, String address, String hotelPhone, String hotelEmail,
                    int roomNumber, String roomType, double pricePerNight,
                    String customerName, String customerEmail, String customerContact,
                    java.time.LocalDate bookingDate, java.time.LocalDate checkInDate, java.time.LocalDate checkOutDate,
                    String serviceName, double serviceCost,
                    String paymentMethod, java.time.LocalDate paymentDate,
                    double roomCharge, double serviceCharge, double totalBill,
                    int rating, String comments) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, hotelPhone, hotelEmail,
              roomNumber, roomType, pricePerNight,
              customerName, customerEmail, customerContact,
              bookingDate, checkInDate, checkOutDate,
              serviceName, serviceCost,
              paymentMethod, paymentDate,
              roomCharge, serviceCharge, totalBill);

        if (rating < 1 || rating > 5) throw new Exception("Rating must be between 1 and 5");
        if (comments.isEmpty()) throw new Exception("Comments cannot be empty");

        this.rating = rating;
        this.comments = comments;
    }

    public int getRating() { return rating; }
    public String getComments() { return comments; }
}
