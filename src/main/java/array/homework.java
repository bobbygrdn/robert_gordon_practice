package array;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter text: "); // Get user input
            String text = sc.nextLine();

            String[] words = text.replace(".", "").split(" "); // split text into words

            String[] uniqueWords = getUniqueWords(words); // get unique words

            int[] counts = getCounts(uniqueWords, words); // get word counts

            printOccurances(uniqueWords, counts); // print results

        }
    }

    // helper method to get unique words
    private static String[] getUniqueWords(String[] words) {
        // Creating an array of strings with the same length as the words array.
        String[] uniqueWords = new String[words.length];
        // A counter for the number of unique words.
        int count = 0;
        // Checking if the word is in the array.
        for (int i = 0; i < words.length; i++) {
            if (!isWordInArray(words[i], uniqueWords)) {
                uniqueWords[count] = words[i];
                count++;
            }
        }
        // Creating a new array with the length of the number of unique words.
        String[] result = new String[count];
        // Copying the unique words from the uniqueWords array to the result array.
        for (int i = 0; i < count; i++) {
            result[i] = uniqueWords[i];
        }
        // Returning the array of unique words.
        return result;
    }

    // helper method to check if a word is in an array
    private static boolean isWordInArray(String word, String[] array) {
        // Checking if the word is in the array.
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                return true;
            }
        }
        // Returning the value false.
        return false;
    }

    // helper method to get counts
    private static int[] getCounts(String[] uniqueWords, String[] words) {
        // Creating an array of integers with the same length as the uniqueWords array.
        int[] counts = new int[uniqueWords.length];

        // Counting the number of times a word appears in the text.
        for (int i = 0; i < uniqueWords.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (uniqueWords[i].equals(words[j])) {
                    counts[i]++;
                }
            }
        }
        // Returning the array of counts.
        return counts;
    }

    // helper method to print results
    private static void printOccurances(String[] uniqueWords, int[] counts) {
        // Printing the results.
        for (int i = 0; i < uniqueWords.length; i++) {
            if (counts[i] == 1) {
                System.out.printf("\"%s\" occurs once\n", uniqueWords[i]);
            } else if (counts[i] == 2) {
                System.out.printf("\"%s\" occurs twice\n", uniqueWords[i]);
            } else {
                System.out.printf("\"%s\" occurs %d times\n", uniqueWords[i], counts[i]);
            }
        }
    }
}
