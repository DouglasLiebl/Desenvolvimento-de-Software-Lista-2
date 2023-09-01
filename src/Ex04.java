import java.util.Scanner;

public class Ex04 {

    private static void numberComparator(Scanner input) {
        try {
             System.out.println("Enter the first number:");
             double n1 = input.nextDouble();
             System.out.println("Enter the second number:");
             double n2 = input.nextDouble();

             if (n1 > n2) System.out.println("The first number is greater");
             else if(n1 == n2) System.out.println("The two numbers are equals");
             else System.out.println("The second number is greater");

        } catch (Exception e) {
            System.out.println("Invalid input. Enter the two numbers again.");
            numberComparator(new Scanner(System.in));
        }
    }

    public static void main(String[] args) {

        numberComparator(new Scanner(System.in));
    }


}
