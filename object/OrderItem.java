public class OrderItem {
    private Product product;    // Sản phẩm
    private int quantity;       // Số lượng
    private double totalPrice;  // Tổng giá cho mặt hàng

    // Constructor
    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.totalPrice = product.getPrice() * quantity;
    }

    // Hiển thị thông tin mặt hàng
    public void displayOrderItem() {
        System.out.println("Product: " + product.getName() + " | Quantity: " + quantity + " | Total: " + totalPrice);
    }

    public double getTotalPrice() { return totalPrice; }
}
