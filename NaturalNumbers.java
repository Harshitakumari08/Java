import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of natural numbers to print
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Printing the first n natural numbers
        System.out.println("The first " + n + " natural numbers are:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
