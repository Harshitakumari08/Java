import java.util.Scanner;

public class ReverseNaturalNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.println("The first " + n + " natural numbers in reverse order are:");
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
        scanner.close();
    }
}
