package id_28279.q10;

public class Product {
    private String productName, productCode;
    private double price;

    public Product(String productName, String productCode, double price) throws Exception {
        if (price <= 0) throw new Exception("Price must be > 0");
        this.productName = productName;
        this.productCode = productCode;
        this.price = price;
    }

    public String getProductName() { return productName; }
    public String getProductCode() { return productCode; }
    public double getPrice() { return price; }
}
