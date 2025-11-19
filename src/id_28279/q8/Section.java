package id_28279.q8;

public class Section extends Library {
    private String sectionName;
    private String sectionCode;

    public Section(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                   String libraryName, String location, String phoneNumber,
                   String sectionName, String sectionCode) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber);
        if (sectionCode.length() < 3) throw new Exception("Section code must be ≥3 chars");
        this.sectionName = sectionName;
        this.sectionCode = sectionCode;
    }

    public String getSectionName() { return sectionName; }
    public String getSectionCode() { return sectionCode; }
}
