package class_practice;

public class Customer {
    private String customerName;
    private String address;
    private String email;
    private String[] purchasedProducts;

    public Customer(String customerName, String address, String email, String[] purchasedProducts) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(String[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public void getCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Purchased Products: ");
        for (String product : purchasedProducts) {
            System.out.println(product);
        }
    }
}
