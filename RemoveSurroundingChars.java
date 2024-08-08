package oops_inheritance;

import java.util.Scanner;

public class RemoveSurroundingChars {

    // Method to remove characters surrounding the '*' character
    public static String removeSurroundingChars(String str) {
        // Find the position of the '*' character
        int starIndex = str.indexOf('*');
        
        // If there is no '*' character, return the original string
        if (starIndex == -1) {
            return str;
        }
        
        // Remove characters to the left and right of the '*'
        // Check for bounds to avoid IndexOutOfBoundsException
        String result = "";
        if (starIndex > 0) {
            result += str.charAt(starIndex - 1); // Add character to the left of '*'
        }
        if (starIndex < str.length() - 1) {
            result += str.charAt(starIndex + 1); // Add character to the right of '*'
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the result after removing surrounding characters of '*'
        String result = removeSurroundingChars(input);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}