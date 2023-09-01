import java.util.Scanner;

public class Ex08 {

    public static void checkInterval(double num) {
        try {
            if (num >= 0 && num <=25) System.out.println("Number interval: [0, 25]");
            else if (num > 25 && num <= 50 ) System.out.println("Number interval: [26, 50]");
            else if (num > 50 && num <= 75) System.out.println("Number interval: [51, 75]");
            else if (num > 75 && num <= 100) System.out.println("Number interval: [76, 100]");
            else throw new Exception("Number out of bounds.");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num = input.nextDouble();

        checkInterval(num);
    }
}
