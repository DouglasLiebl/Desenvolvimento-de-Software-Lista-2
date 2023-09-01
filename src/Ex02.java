import java.util.Scanner;

public class Ex02 {

    public static void isPositive(Scanner input) {

        try {
            System.out.println("Enter a number:");
            double num = input.nextDouble();

            if (num >= 0) System.out.println("Positive");
            else System.out.println("Negative");

        } catch (Exception e) {
            System.out.println("Invalid input");
            isPositive(new Scanner(System.in));
        }

    }

    public static void main(String[] args) {

        isPositive(new Scanner(System.in));

    }
}
