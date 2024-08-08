package oops_inheritance;

import java.util.Scanner;

public class StringRepeater {

    // Method to create a new string with 'n' copies of the first 2 characters
    public static String repeatFirstTwoChars(String str) {
        // Get the length of the string
        int n = str.length();
        
        // Get the first 2 characters of the string
        String prefix = str.length() >= 2 ? str.substring(0, 2) : str;
        
        // Build the result string by repeating the prefix 'n' times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(prefix);
        }
        
        // Convert the result to uppercase and return
        return result.toString().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Generate the new string with repeated characters
        String result = repeatFirstTwoChars(input);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
