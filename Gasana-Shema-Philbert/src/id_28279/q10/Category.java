package id_28279.q10;

public class Category {
    private String categoryName, categoryCode;

    public Category(String categoryName, String categoryCode) throws Exception {
        if (categoryCode.length() < 3) throw new Exception("Category code must be at least 3 characters");
        this.categoryName = categoryName;
        this.categoryCode = categoryCode;
    }

    public String getCategoryName() { return categoryName; }
    public String getCategoryCode() { return categoryCode; }
}
