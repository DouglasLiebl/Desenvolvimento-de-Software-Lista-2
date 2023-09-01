import java.util.Scanner;

public class Ex01 {

    public static void cardinality(Scanner input) {

        try {
            System.out.println("Insira o código de origem do produto:");
            int code = input.nextInt();
            String response;

            switch (code) {
                case 1 -> response = "Sul";
                case 2 -> response = "Norte";
                case 3 -> response = "Leste";
                case 4 -> response = "Oeste";
                case 5, 6 -> response = "Nordeste";
                case 7, 8, 9 -> response = "Sudeste";
                case 10 -> response = "Centro-Oeste";
                case 11 -> response = "Noroeste";
                default -> response = "Importado";
            }

            System.out.println(response);

        } catch (Exception e) {
            System.out.println("Entrada inválida");
            cardinality(new Scanner(System.in));
        }

    }

    public static void main(String[] args) {

        cardinality(new Scanner(System.in));

    }
}