package chapter3;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import tools.Tools;
import java.util.Scanner;
import org.joda.time.*;

/**
 * Find the number of days in a month
 */
public class Exercise11 {
    public static void main(String[] args) {

        Tools.println("Hi! Ready to find the number of days in a month and year?");
        Scanner input = Tools.getScanner();
        Tools.print("Enter the year: ");
        int year = input.nextInt();
        Tools.print("Enter the month: ");
        int month = input.nextInt();
        DateTime dateTime = new DateTime(year, month, 1, 0, 0);
        DateTimeFormatter formatter = DateTimeFormat.forPattern("MMMMM");
        Tools.println(formatter.print(dateTime) + " in " + year + " had " + dateTime.dayOfMonth().getMaximumValue() + " days. Who knew?");

    }
}
