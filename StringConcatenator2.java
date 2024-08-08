package oops_inheritance;

import java.util.Scanner;

public class StringConcatenator2{

    // Method to concatenate strings in the format short + long + short
    public static String concatenateShortLongShort(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Generate the new string in the format short + long + short
        String result = concatenateShortLongShort(string1, string2);

        // Print the result
        System.out.println("The new string is: " + result);

        scanner.close();
    }
}