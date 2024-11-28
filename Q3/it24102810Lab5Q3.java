import java.util.Scanner;

public class it24102810Lab5Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double ROOM_CHARGE = 48000.00;
        final double DISCOUNT_3_DAYS = 10.0 / 100.0;
        final double DISCOUNT_5_DAYS = 20.0 / 100.0;

        System.out.println("Enter start date (1-31):");
        int startDate = scanner.nextInt();

        System.out.println("Enter end date (1-31):");
        int endDate = scanner.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Start date must be less than end date");
            return;
        }

        int numDays = endDate - startDate + 1;

        double totalPrice = numDays * ROOM_CHARGE;

        if (numDays >= 3) {
            if (numDays >= 5) {
                totalPrice *= (1 - DISCOUNT_5_DAYS);
            } else {
                totalPrice *= (1 - DISCOUNT_3_DAYS);
            }
        }

        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE);
        System.out.println("Number of Days Reserved: " + numDays);
        System.out.println("Total Amount to be Paid: Rs. " + totalPrice);

        scanner.close();
    }
}