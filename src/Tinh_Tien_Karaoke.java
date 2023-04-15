import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Tinh_Tien_Karaoke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define constant values
        final int START_TIME_MIN = 9;
        final int END_TIME_MAX = 24;
        final int REGULAR_PRICE = 30000;
        final int OVERTIME_PRICE_FACTOR = 130;
        final double DISCOUNT_RATE = 0.2;
        final int BOTTLE_PRICE = 10000;

        // Prompt user for input
        System.out.print("Enter the start time (in hours): ");
        int start = input.nextInt();

        System.out.print("Enter the end time (in hours): ");
        int end = input.nextInt();

        if(start < START_TIME_MIN || end > END_TIME_MAX || start > 24 || end > 24){
            System.out.println("Opening hours only open from 9 to 24 hours");
            return;
        }

        System.out.print("Enter the total number of water bottles: ");
        int totalBottles = input.nextInt();

        // Calculate cost based on time period
        int hours = end - start;
        double cost = 0;

        if(hours <= 3){
            cost = hours * REGULAR_PRICE;
        }else{
            cost = REGULAR_PRICE * 3 + (hours - 3) * REGULAR_PRICE * OVERTIME_PRICE_FACTOR / 100.0;
        }

        // Apply discount for regular hours
        if(start >= START_TIME_MIN && end <= 17){
            cost *= (1 - DISCOUNT_RATE);
        }

        // Add cost of water bottles
        cost += totalBottles * BOTTLE_PRICE;


        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setCurrency(Currency.getInstance("VND"));
        String formattedCost = format.format(cost);


        System.out.println("Total cost: " + formattedCost + " VND");
        input.close();
    }
}
