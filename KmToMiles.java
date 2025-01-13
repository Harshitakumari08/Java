import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length in kilometer: ");
        float kilometer = scanner.nextFloat();
        
        
        float miles= kilometer * 0.621371f;
        System.out.println("Here's the length in miles will be: " + miles);

        scanner.close();
        
    }
}
