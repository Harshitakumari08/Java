import java.util.Scanner;

public class adding_three_number {
    public static void main(String[] args){
      //scanner input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

      //sum
        int sum = num1 + num2 + num3;
        System.out.println("The sum of the three numbers is: " + sum);
    }
}
