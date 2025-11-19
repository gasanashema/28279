package id_28279.q10;

import java.time.LocalDate;

public class Order {
    private LocalDate orderDate;
    private String orderId;

    public Order(LocalDate orderDate, String orderId) throws Exception {
        if (orderId.isEmpty()) throw new Exception("Order ID cannot be empty");
        this.orderDate = orderDate;
        this.orderId = orderId;
    }

    public LocalDate getOrderDate() { return orderDate; }
    public String getOrderId() { return orderId; }
}
