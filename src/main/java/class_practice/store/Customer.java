package class_practice.store;

import class_practice.store.address.Address;

public class Customer {
    private String customerName;
    private String email;
    private Product[] purchasedProducts;
    private Address[] addresses = new Address[] {};

    public Customer(String customerName, String email, Product[] purchasedProducts) {
        this.customerName = customerName;
        this.email = email;
        this.purchasedProducts = purchasedProducts;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
        System.out.println("Email: " + email);
        System.out.println("Purchased Products: ");
        for (Product purchasedProduct : purchasedProducts) {
            System.out.printf("%s %s\n", purchasedProduct.getProductName(), purchasedProduct.getPrice());
        }
        for (Address address : addresses) {
            System.out.println("Customer Addresses: ");
            System.out
                    .println(address.getStreetNumber() + " " + address.getStreetName() + ", " + address.getCity() + ", "
                            + address.getState());
        }
    }

    public Address[] addAddress(Address address) {
        addresses = new Address[addresses.length + 1];
        for (int i = 0; i < addresses.length; i++) {
            addresses[i] = addresses[i];
        }
        addresses[addresses.length - 1] = address;
        return addresses;
    }
}
