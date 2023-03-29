package class_practice;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myIntArray = { 5, 6, 2, 10, 20, 40 };
        boolean searchResult = binarySearch(myIntArray, 6);
        System.out.println(searchResult);
    }

    private static boolean binarySearch(int[] myIntArray, int target) {
        Arrays.sort(myIntArray);

        int start = 0;
        int end = myIntArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (myIntArray[mid] == target) {
                return true;
            } else if (myIntArray[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
