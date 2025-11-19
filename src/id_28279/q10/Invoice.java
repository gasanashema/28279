package id_28279.q10;

public class Invoice {
    private double totalAmount;

    public Invoice(double totalAmount) throws Exception {
        if (totalAmount <= 0) throw new Exception("Total amount must be > 0");
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() { return totalAmount; }
}
