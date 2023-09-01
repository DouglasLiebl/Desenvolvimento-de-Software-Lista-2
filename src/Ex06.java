import java.awt.*;
import java.util.Scanner;

public class Ex06 {

    public static void timeReceiver(Scanner input) {
        try {
            System.out.println("Enter start time:");
            long startTime = getMinutes(input.nextLine());

            System.out.println("Enter end time:");
            long endTime = getMinutes(input.nextLine());

            String timePlayed = timeCalculator(startTime, endTime);
            System.out.println(timePlayed);

        } catch (Exception e) {
            System.out.println("Invalid input. Enter the two times again obeying the following format: " +
                    "\n00:00 or 0:00.");
            timeReceiver(new Scanner(System.in));
        }
    }

    public static long getMinutes(String time) throws Exception {
        if (time.isBlank() || time.isEmpty()) throw new Exception();

        String[] timeCutter= time.split(":");
        return ((Long.parseLong(timeCutter[0])) * 60) + Long.parseLong(timeCutter[1]);
    }

    public static String timeCalculator(long startTime, long endTime) {
        String response = "";

        if (startTime > endTime) {
           endTime += 1440;
        }
        long diff = endTime - startTime;

        long hours = diff / 60;
        long minutes = diff % 60;

        if (hours < 1) response = "The match lasted " + minutes + " minutes";
        else if (minutes != 0) response = "The match lasted " + hours + " hour(s) and " + minutes + " minutes";
        else response = "The match lasted " + hours + " hour(s)";

        return response;
    }

    public static void main(String[] args) {

        timeReceiver(new Scanner(System.in));

    }
}
