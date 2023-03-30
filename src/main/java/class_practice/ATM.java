package class_practice;

// Let's create an ATM class
public class ATM {
    // Class Properties
    private String name;
    private String password;
    private int balance;
    private int pin;

    // Constructor
    public ATM(String name, String password, int balance, int pin) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.pin = pin;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    // Custom Methods
    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void checkBalance() {
        System.out.println("Your Balance is: $" + this.balance);
    }

    public boolean login(int enteredPin) {
        if (enteredPin == this.pin) {
            return true;
        } else {
            System.out.println("Wrong pin");
            return false;
        }
    }

    public void startMenu() {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check balance");
        System.out.println("4. Exit");
        System.out.println();
    }

    public void userInfo() {
        System.out.println(name);
        System.out.println(password);
        System.out.println(balance);
        System.out.println(pin);
    }

    public static void bankName(String name) {
        System.out.printf("The name of the bank is %s\n", name);
    }

}
