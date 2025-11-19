package id_28279.q8;

public class Book extends Section {
    private String title;
    private String author;
    private String ISBN;

    public Book(int id, java.time.LocalDate createdDate, java.time.LocalDate updatedDate,
                String libraryName, String location, String phoneNumber,
                String sectionName, String sectionCode,
                String title, String author, String ISBN) throws Exception {
        super(id, createdDate, updatedDate, libraryName, location, phoneNumber, sectionName, sectionCode);
        if (ISBN.length() < 10) throw new Exception("ISBN must be ≥10 chars");
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getISBN() { return ISBN; }
}
