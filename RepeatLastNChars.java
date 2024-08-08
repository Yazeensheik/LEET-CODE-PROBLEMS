package oops_inheritance;

import java.util.Scanner;

public class RepeatLastNChars {

    // Method to create a new string with n repetitions of the last n characters
    public static String repeatLastNChars(String str, int n) {
        // Get the last n characters of the string
        String lastNChars = str.substring(str.length() - n);
        
        // Create a new string by repeating the last n characters n times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastNChars);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter the integer n
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

        // Get the result after repeating the last n characters
        String result = repeatLastNChars(inputString, n);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
