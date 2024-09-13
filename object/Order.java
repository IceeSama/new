import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;           // Mã đơn hàng
    private Customer customer;        // Khách hàng
    private List<OrderItem> items;    // Danh sách các sản phẩm trong đơn hàng
    private double totalAmount;       // Tổng giá trị đơn hàng

    // Constructor
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    // Thêm sản phẩm vào đơn hàng
    public void addItem(Product product, int quantity) {
        OrderItem item = new OrderItem(product, quantity);
        items.add(item);
        totalAmount += item.getTotalPrice();
    }

    // Hiển thị thông tin đơn hàng
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        customer.displayCustomer();
        for (OrderItem item : items) {
            item.displayOrderItem();
        }
        System.out.println("Total Amount: " + totalAmount);
    }
}
