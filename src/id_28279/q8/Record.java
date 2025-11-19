package id_28279.q8;

public class Record extends Payment {
    private double totalFine;

    public Record(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  java.time.LocalDate borrowDate, java.time.LocalDate returnDate,
                  double fineAmount, int daysLate,
                  java.time.LocalDate paymentDate, String paymentMode,
                  double totalFine,
                  String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber,
                sectionName, sectionCode, title, author, ISBN,
                memberName, memberId, contactNumber,
                borrowDate, returnDate, fineAmount, daysLate,
                paymentDate, paymentMode, existingPhone);
        if (totalFine <= 0) throw new Exception("Total fine must be >0");
        this.totalFine = totalFine;
    }

    public double getTotalFine() { return totalFine; }
}
