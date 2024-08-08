import java.util.Scanner;

// Custom exception for negative values
class NegativeValueException extends Exception {
    public NegativeValueException(String message) {
        super(message);
    }
}

// Custom exception for values out of range
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] studentNames = new String[2];
        int[][] marks = new int[2][3];
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = sc.nextLine();
            
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                
                try {
                    String input = sc.nextLine();
                    int mark = Integer.parseInt(input);

                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    } else if (mark > 100) {
                        throw new OutOfRangeException("Marks should be in the range of 0 to 100.");
                    }

                    marks[i][j] = mark;

                } catch (NumberFormatException e) {
                    System.out.println("NumberFormatException: Please enter a valid integer for marks.");
                    j--; // Prompt user again for the same subject marks
                } catch (NegativeValueException | OutOfRangeException e) {
                    System.out.println(e.getMessage());
                    j--; // Prompt user again for the same subject marks
                }
            }
        }

        // Calculate and print average marks
        for (int i = 0; i < 2; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += marks[i][j];
            }
            double average = (double) sum / 3;
            System.out.println("Average marks of " + studentNames[i] + ": " + average);
        }
    }
}
