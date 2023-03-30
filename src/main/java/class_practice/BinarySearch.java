package class_practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myIntArray = { 5, 6, 2, 10, 20, 40 };
        boolean searchResult = binarySearch(myIntArray, 6); // run binary search on array
        System.out.println(searchResult); // print results
    }

    private static boolean binarySearch(int[] myIntArray, int target) {
        // Sorting the array in ascending order.
        Arrays.sort(myIntArray);

        // Setting the start of the array to 0.
        int start = 0;
        // Setting the end of the array to the last index of the array.
        int end = myIntArray.length - 1;

        // Checking to see if the start of the array is less than or equal to the end of
        // the array.
        while (start <= end) {
            // This is a way to find the middle of the array.
            int mid = start + (end - start) / 2;
            // This is checking to see if the middle of the array is equal to the target. If
            // it is, then it returns true. If it is not, then it checks to see if the
            // middle of
            // the array is less than the target. If it is, then it sets the start of the
            // array to the
            // middle of the array plus one. If it is not, then it sets the end of the array
            // to the middle
            // of the array minus one.
            if (myIntArray[mid] == target) {
                return true;
            } else if (myIntArray[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Returning false if the target is not found in the array.
        return false;
    }
}
