package class_practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Calling the static method bankName from the ATM class.
        ATM.bankName("JPMorgan & Chase");

        // Create an ATM object using the ATM class
        ATM atm = new ATM("John", "1234", 1000, 1234);

        // Calling the userInfo instance method from the ATM class.
        atm.userInfo();

        // Creating a new scanner object called scan.
        try (Scanner scan = new Scanner(System.in)) {

            // Setting the boolean variable loggedIn to false.
            boolean loggedIn = false;

            // Prompt user to login
            while (loggedIn == false) {
                System.out.println("Please enter your pin: ");
                int pin = scan.nextInt();
                loggedIn = atm.login(pin);
            }

            // This is just a welcome message for the user.
            if (loggedIn == true) {
                System.out.printf("Welcome %s!\n", atm.getName());
            }

            // Checking if the user is logged in.
            while (loggedIn == true) {

                // Calling the startMenu method from the ATM class.
                atm.startMenu();

                // Getting the user's input and storing it in the variable choice.
                int choice = scan.nextInt();

                // A switch statement that is used to determine what the user wants to do.
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
