package id_28279.q4;

public class Room extends Hotel {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;

    public Room(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String hotelName, String address, String phoneNumber, String email,
                int roomNumber, String roomType, double pricePerNight) throws Exception {
        super(id, createdDate, updatedDate, hotelName, address, phoneNumber, email);

        if (roomNumber <= 0) throw new Exception("Room number must be > 0");
        if (roomType.isEmpty()) throw new Exception("Room type cannot be empty");
        if (pricePerNight <= 0) throw new Exception("Price per night must be > 0");

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getRoomType() { return roomType; }
    public double getPricePerNight() { return pricePerNight; }
}
