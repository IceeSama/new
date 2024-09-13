public class Product {
    private String id;      // Mã sản phẩm
    private String name;    // Tên sản phẩm
    private double price;   // Giá sản phẩm
    private int quantity;   // Số lượng sản phẩm trong kho

    // Constructor
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters và setters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    // Hiển thị thông tin sản phẩm
    public void displayProduct() {
        System.out.println("Product: " + name + " | Price: " + price + " | Stock: " + quantity);
    }
}
