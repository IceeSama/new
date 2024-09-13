public class Customer {
    private String id;          // Mã khách hàng
    private String name;        // Tên khách hàng
    private String phoneNumber; // Số điện thoại

    // Constructor
    public Customer(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters và setters
    public String getId() { return id; }
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }

    // Hiển thị thông tin khách hàng
    public void displayCustomer() {
        System.out.println("Customer: " + name + " | Phone: " + phoneNumber);
    }
}
