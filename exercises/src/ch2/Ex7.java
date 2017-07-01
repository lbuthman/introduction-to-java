package ch2;

import tools.*;
import java.util.Scanner;

/**
 * Find the number of years
 */

public class Ex7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        final int DAYS_IN_YEAR = 365;

        final int MINUTES_IN_YEAR = MINUTES_IN_HOUR * HOURS_IN_DAY * DAYS_IN_YEAR;
        final int MINUTES_IN_DAY = MINUTES_IN_HOUR * HOURS_IN_DAY;

        Tools.print("Enter the number of minutes: ");

        int minutes = input.nextInt();
        int years = minutes / MINUTES_IN_YEAR;
        int days = (minutes % MINUTES_IN_YEAR) / MINUTES_IN_DAY;

        Tools.println( years + " " + days);
    }
}
