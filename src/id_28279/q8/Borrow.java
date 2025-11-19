package id_28279.q8;

import java.time.LocalDate;

public class Borrow extends Member {
    private LocalDate borrowDate;
    private LocalDate returnDate;

    public Borrow(int id, LocalDate createdDate, LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  LocalDate borrowDate, LocalDate returnDate,
                  String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode,
                title, author, ISBN, memberName, memberId, contactNumber, existingPhone);
        if (returnDate.isBefore(borrowDate)) throw new Exception("Return date cannot be before borrow date");
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public LocalDate getBorrowDate() { return borrowDate; }
    public LocalDate getReturnDate() { return returnDate; }
}
