package oops_inheritance;

import java.util.Scanner;

public class RemoveFirstLastCharacter {

    // Method to remove the first and last character of a string
    public static String removeFirstAndLastChar(String str) {
        if (str.length() <= 2) {
            // If the string length is 2 or less, return an empty string
            return "";
        } else {
            // Remove the first and last character
            return str.substring(1, str.length() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the result after removing the first and last characters
        String result = removeFirstAndLastChar(input);

        // Print the result
        System.out.println("The new string is: " + result);

        scanner.close();
    }
}