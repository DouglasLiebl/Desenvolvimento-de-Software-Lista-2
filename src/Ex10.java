import java.util.Scanner;

public class Ex10 {

    public static String determineSigns(String birthDate) {
        String[] dateCutter = birthDate.split("/");
        int day = Integer.parseInt(dateCutter[0]);
        int month = Integer.parseInt(dateCutter[1]);


        if ((month == 3 && day >= 21) || (month == 4 && day<= 19)) {
            return "Aries";
        } else if (month == 4 || month == 5 && day <= 20) {
            return "Taurus";
        } else if (month == 5 || month == 6 && day <= 20) {
            return "Gemini";
        } else if (month == 6 || month == 7 && day <= 22) {
            return "Cancer";
        } else if (month == 7 || month == 8 && day <= 22) {
            return "Leo";
        } else if (month == 8 || month == 9 && day <= 22) {
            return "Virgo";
        } else if (month == 9 || month == 10 && day <= 22) {
            return "Libra";
        } else if (month == 10 || month == 11 && day <= 21) {
            return "Scorpio";
        } else if (month == 11 || month == 12 && day <= 21) {
            return "Sagittarius";
        } else if (month == 12 || month == 1 && day <= 19) {
            return "Capricorn";
        } else if (month == 1 || month == 2 && day <= 18) {
            return "Aquarius";
        } else {
            return "Pisces";
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your birth date (DD/MM):");
        String birthDate = input.nextLine();

        System.out.println(determineSigns(birthDate));
    }
}
