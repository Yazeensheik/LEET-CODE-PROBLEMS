package oops_inheritance;

import java.util.Scanner;

public class StringHalf {

    // Method to return the first half of the string if its length is even, otherwise return null
    public static String getFirstHalfIfEven(String str) {
        int length = str.length();
        
        // Check if the length of the string is even
        if (length % 2 == 0) {
            // Return the first half of the string
            return str.substring(0, length / 2);
        } else {
            // Return null for odd length
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the result based on the string length
        String result = getFirstHalfIfEven(input);

        // Print the result
        if (result != null) {
            System.out.println("The first half of the string is: " + result);
        } else {
            System.out.println("The string length is odd, returning null.");
        }

        scanner.close();
    }
}
