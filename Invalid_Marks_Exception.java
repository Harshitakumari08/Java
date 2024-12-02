import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] marks = new int[3];
        Scanner sc = new Scanner(System.in);
        try {
            for (int i = 0; i < 3; i++) {
                marks[i] = sc.nextInt();
                if (marks[i] < 0 || marks[i] > 100) {
                    throw new InvalidMarksException("Marks should be between 0 and 100.");
                }
            }
            double average = (marks[0] + marks[1] + marks[2]) / 3.0;
            String grade = average > 90 ? "A" : average > 75 ? "B" : average > 50 ? "C" : "D";
            System.out.printf("Average Marks: %.2f\n", average);
            System.out.println("Grade: " + grade);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
