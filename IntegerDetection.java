import java.util.Scanner;

public class IntegerDetection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        boolean isInteger = sc.hasNextInt();
        System.out.println(isInteger? " You enter a Integer:" + sc.nextInt() : "The input is not an integer.");
    
        sc.close();

    }
}
