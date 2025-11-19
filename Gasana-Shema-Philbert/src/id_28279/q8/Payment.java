package id_28279.q8;

import java.time.LocalDate;

public class Payment extends Fine {
    private LocalDate paymentDate;
    private String paymentMode;

    public Payment(int id, LocalDate createdDate, LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode,
                   String title, String author, String ISBN,
                   String memberName, int memberId, String contactNumber,
                   LocalDate borrowDate, LocalDate returnDate,
                   double fineAmount, int daysLate,
                   LocalDate paymentDate, String paymentMode,
                   String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate, fineAmount, daysLate, existingPhone);
        this.paymentDate = paymentDate;
        this.paymentMode = paymentMode;
    }

    public LocalDate getPaymentDate() { return paymentDate; }
    public String getPaymentMode() { return paymentMode; }
}
