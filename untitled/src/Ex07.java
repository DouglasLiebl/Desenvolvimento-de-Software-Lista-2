import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {

    public static void dataCollector(Scanner input) {
        try {
            System.out.println("Enter item code:");
            double price = itemValues(input.nextInt());

            System.out.println("Enter the item quantity:");
            int quantity = input.nextInt();

            double totalValue = priceCalculator(price, quantity);

            System.out.printf("Total: U$ %.2f", totalValue);

        } catch (Exception e) {
            if (e instanceof InputMismatchException) System.out.println("Only integers are accepted.");
            else System.out.println(e.getMessage());

            dataCollector(new Scanner(System.in));
        }

    }

    public static double priceCalculator(double price, int quantity) {
        return price * quantity;
    }

    public static double itemValues(int itemCode) throws Exception {
        double price = 0;

        switch (itemCode) {
            case 1 -> price = 4.00;
            case 2 -> price = 4.50;
            case 3 -> price = 5.00;
            case 4 -> price = 2.00;
            case 5 -> price = 1.50;
            default -> throw new Exception("Item code not exists");
        }

        return price;
    }

    public static void main(String[] args) {

        dataCollector(new Scanner(System.in));
    }
}
