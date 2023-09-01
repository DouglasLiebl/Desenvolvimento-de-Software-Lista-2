import java.util.Scanner;

public class Ex05 {

    public static void quantityReceiver(Scanner input) {
        try {
            System.out.println("Enter the quantity of apples purchased:");

            double totalPrice = priceCalculator(input.nextInt());
            System.out.printf("Total price: U$ %.2f", totalPrice);

        } catch (Exception e) {
            System.out.println("Invalid input, only integers are accepted");
            quantityReceiver(new Scanner(System.in));
        }
    }

    public static double priceCalculator(int quantity) {
        double totalPrice;

        if (quantity >= 12) {
            totalPrice = quantity * 0.40;
        } else {
            totalPrice = quantity * 0.50;
        }

        return totalPrice;
    }

    public static void main(String[] args) {

        quantityReceiver(new Scanner(System.in));

    }
}
