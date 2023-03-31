package class_practice;

public class MainHomework {
    public static void main(String[] args) {
        Product product1 = new Product("Pen", 2.99);
        Product product2 = new Product("Pencil", 1.99);

        Customer customer1 = new Customer("John", "123 Main Street", "j@j.com",
                new String[] { product1.getProductName(), product2.getProductName() });

        customer1.getCustomerInfo();
    }
}
