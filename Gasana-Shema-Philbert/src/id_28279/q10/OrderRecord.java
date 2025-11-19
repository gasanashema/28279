package id_28279.q10;

import java.time.LocalDate;
import java.util.Scanner;

public final class OrderRecord extends Invoice {
    private Store store;
    private Category category;
    private Product product;
    private Customer customer;
    private Order order;
    private Payment payment;
    private Shipping shipping;

    public OrderRecord(Store store, Category category, Product product,
                       Customer customer, Order order, Payment payment, Shipping shipping) throws Exception {
        super(product.getPrice() + shipping.getShippingCost());
        this.store = store;
        this.category = category;
        this.product = product;
        this.customer = customer;
        this.order = order;
        this.payment = payment;
        this.shipping = shipping;
        if (store.getEmail().equals(customer.getContactNumber()))
            throw new Exception("Customer contact cannot be same as store email/phone");
    }

    public double calculateTotalAmount() {
        return product.getPrice() + shipping.getShippingCost();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("========= ONLINE SHOPPING SYSTEM =========");

            int id = 0;
            LocalDate createdDate = null, updatedDate = null;
            String storeName = "", storeAddress = "", storeEmail = "";
            String categoryName = "", categoryCode = "";
            String productName = "", productCode = "";
            double price = 0;
            String customerName = "", customerContact = "", customerAddress = "";
            LocalDate orderDate = null;
            String orderId = "";
            String paymentMethod = "", paymentStatus = "";
            String shippingAddress = "";
            double shippingCost = 0;

            while (true) {
                try {
                    System.out.print("Enter ID: ");
                    id = Integer.parseInt(sc.nextLine().trim());
                    if (id <= 0) throw new Exception("ID must be >0");
                    break;
                } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
            }

            while (true) {
                try {
                    System.out.print("Created date (YYYY-MM-DD): ");
                    createdDate = LocalDate.parse(sc.nextLine().trim());
                    break;
                } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
            }

            while (true) {
                try {
                    System.out.print("Updated date (YYYY-MM-DD): ");
                    updatedDate = LocalDate.parse(sc.nextLine().trim());
                    if (updatedDate.isBefore(createdDate)) throw new Exception("Updated date cannot be before created date");
                    break;
                } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
            }

            while (true) {
                System.out.print("Store name: ");
                storeName = sc.nextLine().trim();
                if (!storeName.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            System.out.print("Store address: ");
            storeAddress = sc.nextLine().trim();

            while (true) {
                System.out.print("Store email: ");
                storeEmail = sc.nextLine().trim();
                if (storeEmail.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$")) break;
                System.out.println("ERROR: Invalid email");
            }

            Store store = new Store(id, createdDate, updatedDate, storeName, storeAddress, storeEmail);

            while (true) {
                System.out.print("Category name: ");
                categoryName = sc.nextLine().trim();
                if (!categoryName.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            while (true) {
                System.out.print("Category code: ");
                categoryCode = sc.nextLine().trim();
                if (categoryCode.length() >= 3) break;
                System.out.println("ERROR: Must be >=3 chars");
            }

            Category category = new Category(categoryName, categoryCode);

            while (true) {
                System.out.print("Product name: ");
                productName = sc.nextLine().trim();
                if (!productName.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            while (true) {
                System.out.print("Product code: ");
                productCode = sc.nextLine().trim();
                if (!productCode.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            while (true) {
                try {
                    System.out.print("Product price: ");
                    price = Double.parseDouble(sc.nextLine().trim());
                    if (price <= 0) throw new Exception("Price must be >0");
                    break;
                } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
            }

            Product product = new Product(productName, productCode, price);

            while (true) {
                System.out.print("Customer name: ");
                customerName = sc.nextLine().trim();
                if (!customerName.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            while (true) {
                System.out.print("Customer contact (10 digits): ");
                customerContact = sc.nextLine().trim();
                if (customerContact.matches("\\d{10}")) break;
                System.out.println("ERROR: Must be 10 digits");
            }

            System.out.print("Customer address: ");
            customerAddress = sc.nextLine().trim();

            Customer customer = new Customer(customerName, customerContact, customerAddress);

            while (true) {
                try {
                    System.out.print("Order date (YYYY-MM-DD): ");
                    orderDate = LocalDate.parse(sc.nextLine().trim());
                    break;
                } catch (Exception e) { System.out.println("ERROR: Invalid date"); }
            }

            while (true) {
                System.out.print("Order ID: ");
                orderId = sc.nextLine().trim();
                if (!orderId.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            Order order = new Order(orderDate, orderId);

            while (true) {
                System.out.print("Payment method: ");
                paymentMethod = sc.nextLine().trim();
                if (!paymentMethod.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            while (true) {
                System.out.print("Payment status: ");
                paymentStatus = sc.nextLine().trim();
                if (!paymentStatus.isEmpty()) break;
                System.out.println("ERROR: Cannot be empty");
            }

            Payment payment = new Payment(paymentMethod, paymentStatus);

            System.out.print("Shipping address: ");
            shippingAddress = sc.nextLine().trim();

            while (true) {
                try {
                    System.out.print("Shipping cost: ");
                    shippingCost = Double.parseDouble(sc.nextLine().trim());
                    if (shippingCost < 0) throw new Exception("Cannot be negative");
                    break;
                } catch (Exception e) { System.out.println("ERROR: " + e.getMessage()); }
            }

            Shipping shipping = new Shipping(shippingAddress, shippingCost);

            OrderRecord record = new OrderRecord(store, category, product, customer, order, payment, shipping);

            System.out.println("\n ------------- ------------- ------------\n");
            System.out.println("Student ID: 28279");
            System.out.println("\n========= ONLINE SHOPPING RECORD =========");
            System.out.println("Store: " + record.store.getStoreName() + " | Email: " + record.store.getEmail());
            System.out.println("Address: " + record.store.getAddress());
            System.out.println("Category: " + record.category.getCategoryName() + " | Code: " + record.category.getCategoryCode());
            System.out.println("Product: " + record.product.getProductName() + " | Code: " + record.product.getProductCode() + " | Price: " + record.product.getPrice());
            System.out.println("Customer: " + record.customer.getCustomerName() + " | Contact: " + record.customer.getContactNumber() + " | Address: " + record.customer.getAddress());
            System.out.println("Order date: " + record.order.getOrderDate() + " | Order ID: " + record.order.getOrderId());
            System.out.println("Payment: " + record.payment.getPaymentMethod() + " | Status: " + record.payment.getPaymentStatus());
            System.out.println("Shipping address: " + record.shipping.getShippingAddress() + " | Cost: " + record.shipping.getShippingCost());
            System.out.println("Total Amount: " + record.getTotalAmount() + " | Calculated: " + record.calculateTotalAmount());
            System.out.println("========================================");

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        sc.close();
    }
}
