package ch3;

import tools.Tools;

import java.util.Random;
import java.util.Scanner;

/**
 * Random month
 */

enum Month {
    JANUARY (1),
    FEBRUARY (2),
    MARCH (3),
    APRIL (4),
    MAY (5),
    JUNE (6),
    JULY (7),
    AUGUST (8),
    SEPTEMBER (9),
    OCTOBER (10),
    NOVEMBER (11),
    DECEMBER (12);

    private final int monthNumber;

    Month(int i) {
        this.monthNumber = i;
    }

    public int getMonthNumber() {
        return monthNumber;
    }
}

public class Ex4 {
    public static void main(String[] args) {

        Random random = new Random(42);
        Scanner input = new Scanner(System.in);

        Tools.println("Welcome to the random month generator!");

        String q;

        while (true) {

            Tools.println("Ready for a month?");
            Tools.print("(press q to quit or any key to continue): ");

            q = input.next();
            if (q.equals("q")) {
                break;
            }

            int monthInt = random.nextInt(12) + 1;
            String monthString = "";

            for (Month m: Month.values()) {
                if (monthInt == m.getMonthNumber()) {
                    monthString = m.name();
                }
            }

            Tools.println("Your random month is " + monthString);

        }

        Tools.println("Thanks for living your life! I will miss you a lot!");
    }
}
