import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ", have a good day!");

        scanner.close();
    }
    
}
