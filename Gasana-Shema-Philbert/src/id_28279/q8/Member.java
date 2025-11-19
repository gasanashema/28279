package id_28279.q8;

public class Member extends Book {
    private String memberName;
    private int memberId;
    private String contactNumber;

    public Member(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                  String libraryName, String location, String phoneNumber,
                  String sectionName, String sectionCode,
                  String title, String author, String ISBN,
                  String memberName, int memberId, String contactNumber,
                  String existingPhone) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode, title, author, ISBN);
        if (memberId <= 0) throw new Exception("Member ID must be >0");
        if (!contactNumber.matches("\\d{10}")) throw new Exception("Invalid member phone");
        if (contactNumber.equals(existingPhone)) throw new Exception("Member phone cannot be same as library phone");
        this.memberName = memberName;
        this.memberId = memberId;
        this.contactNumber = contactNumber;
    }

    public String getMemberName() { return memberName; }
    public int getMemberId() { return memberId; }
    public String getContactNumber() { return contactNumber; }
}
