import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for Subject1 : ");
        int subject1 = scanner.nextInt();
      
        System.out.print("Enter the marks for Subject2 : ");
        int subject2= scanner.nextInt();
      
        System.out.print("Enter the marks for Subject3 : ");
        int subject3= scanner.nextInt();
      
    // converting subject marks to gradepoint
        double gradePoint1 = subject1/10.0;
        double gradePoint2 = subject2/10.0;
        double gradePoint3 = subject3/10.0;

    // Calculating CGPA
        double cgpa = (gradePoint1 + gradePoint2 + gradePoint3) / 3;

        System.out.printf("The CGPA is: %.2f%n", cgpa);

    // closing scanner
        scanner.close();
    }
}
