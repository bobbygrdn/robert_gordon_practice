package class_practice.store;

import class_practice.store.address.Address;

public class Customer {
    private CustomerName customerName;
    private String email;
    private Product[] purchasedProducts;
    private Address[] addresses = new Address[] {};

    public Customer(String email, Product[] purchasedProducts, CustomerName customerName) {
        this.email = email;
        this.purchasedProducts = purchasedProducts;
        this.customerName = customerName;
    }

    public String getCustomerInfo() {
        String result = "";

        result += "Customer Name: " + customerName.getFullName() + "\n";
        result += "Email: " + email + "\n";
        result += "Purchased Products: ";
        for (Product purchasedProduct : purchasedProducts) {
            result += purchasedProduct.getProductName() + " " + purchasedProduct.getPrice() + "\n";
        }
        result += "Customer Addresses: \n";
        for (Address address : addresses) {
            if (address.isPrimaryAdress()) {
                result += "*";
            }
            result += address.getStreetNumber() + " " + address.getStreetName() + ", " +
                    address.getCity() + ", " + address.getState() + "\n";
        }
        return result;
    }

    public void addAddress(Address address) {
        Address[] newAddresses = new Address[addresses.length + 1];
        for (int i = 0; i < addresses.length; i++) {
            newAddresses[i] = this.addresses[i];
        }
        newAddresses[addresses.length] = address;
        this.addresses = newAddresses;
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

    public CustomerName getCustomerName() {
        return customerName;
    }

    public void setCustomerName(CustomerName customerName) {
        this.customerName = customerName;
    }

}
