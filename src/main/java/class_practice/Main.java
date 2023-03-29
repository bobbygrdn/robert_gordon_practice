package class_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an ATM object using the ATM class
        ATM atm = new ATM("John", "1234", 1000, 1234);
        try (Scanner scan = new Scanner(System.in)) {

            boolean loggedIn = false;

            // Prompt user to login
            while (loggedIn == false) {
                System.out.println("Please enter your pin: ");
                int pin = scan.nextInt();
                loggedIn = atm.login(pin);
            }

            if (loggedIn == true) {
                System.out.printf("Welcome %s!\n", atm.getName());

            }

            while (loggedIn == true) {

                atm.startMenu();
                int choice = scan.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("How much would you like to withdraw?");
                        atm.withdraw(scan.nextInt());
                        break;
                    case 2:
                        System.out.println("How much would you like to deposit?");
                        atm.deposit(scan.nextInt());
                        break;
                    case 3:
                        atm.checkBalance();
                        break;
                    case 4:
                        System.out.println("Thank you for banking with us!");
                        loggedIn = false;
                        break;
                }
            }
        }
    }
}
