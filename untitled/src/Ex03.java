import java.util.Scanner;

public class Ex03 {

    public static void numberVerifier(Scanner input) {

        try {
            System.out.println("Enter a number:");
            double num = input.nextDouble();

            if (num == 0) System.out.println("Zero");
            else if (num > 0) System.out.println("Positive");
            else System.out.println("Negative");

        } catch (Exception e) {
            System.out.println("Invalid input");
            numberVerifier(new Scanner(System.in));
        }
    }

    public static void main(String[] args) {

        numberVerifier(new Scanner(System.in));
    }
}
