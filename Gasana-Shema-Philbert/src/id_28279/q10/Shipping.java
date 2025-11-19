package id_28279.q10;

public class Shipping {
    private String shippingAddress;
    private double shippingCost;

    public Shipping(String shippingAddress, double shippingCost) throws Exception {
        if (shippingCost < 0) throw new Exception("Shipping cost cannot be negative");
        this.shippingAddress = shippingAddress;
        this.shippingCost = shippingCost;
    }

    public String getShippingAddress() { return shippingAddress; }
    public double getShippingCost() { return shippingCost; }
}
