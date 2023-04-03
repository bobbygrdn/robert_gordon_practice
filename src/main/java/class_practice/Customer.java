package class_practice;

public class Customer {
    private String customerName;
    private String address;
    private String email;
    private Product[] purchasedProducts;

    public Customer(String customerName, String address, String email, Product[] purchasedProducts) {
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

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public void getCustomerInfo() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Purchased Products: ");
        for (Product purchasedProduct : purchasedProducts) {
            System.out.printf("%s %s\n", purchasedProduct.getProductName(), purchasedProduct.getPrice());
        }
    }
}
