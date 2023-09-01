import java.util.Scanner;

public class Ex09 {

    public static double calculator(double salary) {
        double tax = 0;
        double remnant = 0;

        if (salary <= 2000) {
            tax = 0;
        } else if(salary <= 3000) {
            remnant = salary - 2000;
            tax = remnant * 0.08;
        } else if (salary <= 4500) {
            remnant = salary - 3000;
            tax = remnant * 0.18;
            tax += (1000 * 0.08);
        } else {
            remnant = salary - 4500;
            tax = remnant * 0.28;
            tax += (1000 * 0.08);
            tax += (1500 * 0.18);
        }

        return tax;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = input.nextDouble();

        double tax = calculator(salary);
        System.out.printf("Tax value: U$ %.2f", tax);
    }
}
