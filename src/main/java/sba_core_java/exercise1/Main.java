package sba_core_java.exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] myStringArrayTestValues = { "life", "is", "worth", "living", "with", "passion" };

        MyOperation myOperation = new MyOperation();

        myOperation.convertStringArrayIntoArrayList(myStringArrayTestValues);

        System.out.println(myOperation.myArrayList.toString());

        myOperation.replaceAnElementInTheStringArrayListGiven(1);

        System.out.println(myOperation.myArrayList.toString());

        ArrayList<String> newArrayList = myOperation.createANewArrayListFromExistingArray();

        System.out.println(newArrayList.toString());

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter an integer: ");
            if (!scanner.hasNextInt()) {
                try {
                    throw new MyOwnException("Invalid integer");
                } catch (MyOwnException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                Integer newInt = scanner.nextInt();
                System.out.println(newInt);
            }
        }

    }
}
