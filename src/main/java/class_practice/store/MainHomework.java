package class_practice.store;

public class MainHomework {
    public static void main(String[] args) {
        Product product1 = new Product("Pen", 2.99);
        Product product2 = new Product("Pencil", 1.99);

        Customer customer1 = new Customer("John", "123 Main Street", "j@j.com",
                new Product[] { product1, product2 });

        customer1.getCustomerInfo();
    }
}
