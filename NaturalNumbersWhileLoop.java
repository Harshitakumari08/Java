import java.util.Scanner;

public class NaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of natural numbers to print
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Printing the first n natural numbers using while loop
        System.out.println("The first " + n + " natural numbers are:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        // Close the scanner
        scanner.close();
    }
}
