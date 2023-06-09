package class_practice.store;

import class_practice.store.address.Address;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Pen", 2.99);
        Product product2 = new Product("Pencil", 1.99);

        Customer customer1 = new Customer("j@j.com",
                new Product[] { product1, product2 }, new CustomerName("John", "Doe", "Smith"));

        Address customer1Address = new Address(true, 125, "Main street", "New York City", "New York");
        Address customer2Address = new Address(false, 215, "Second street", "New York City", "New York");

        customer1.addAddress(customer1Address);
        customer1.addAddress(customer2Address);

        String customer1Info = customer1.getCustomerInfo();
        System.out.println(customer1Info);
    }
}
