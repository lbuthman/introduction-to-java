package ch3;

import java.util.Scanner;

import tools.Tools;

/**
 * Financial application: monetary units
 */

enum ChangeDenominations {
    Penny(0), Nickel(0), Dime(0), Quarter(0), Dollar(0);

    private int count;

    ChangeDenominations(int count) {
        this.count = count;
    }

    void plusOne() {count++;}

    int getCount() { return count;}

    String plural(String denomination) {
        if (denomination.charAt(denomination.length() - 1) == 'y') {
            return denomination.substring(0, denomination.length() - 1) + "ies";
        } else {
            return denomination + "s";
        }
    }
}

public class Ex7 {

    private static Scanner input = new Scanner(System.in);

    private static String getIntString() {

        String number = (input.nextDouble() * 100) + "";

        return  number.replace(".0", "");
    }

    public static void main(String[] args) {

        Tools.print("Enter the total price: $");

        //add error catch
        String number = getIntString();
        int total = Integer.parseInt(number);


        Tools.print("Enter the customer payment amount: $");

        int payment;

        while (true) {
            number = getIntString();
            payment = Integer.parseInt(number);

            if (payment >= total) {break;}

            Tools.println("I'm sorry, that payment is not enough.");
            Tools.print("Please enter the new customer payment amount: $");
        }

        Tools.println("Calculating change due ...");

        int changeDue = payment - total;

        while (changeDue >= 0) {
            if (changeDue >= 100) {
                ChangeDenominations.Dollar.plusOne();
                changeDue -= 100;
            } else if (changeDue >= 25) {
                ChangeDenominations.Quarter.plusOne();
                changeDue -=25;
            } else if (changeDue >= 10) {
                ChangeDenominations.Dime.plusOne();
                changeDue -= 10;
            } else if (changeDue >= 5) {
                ChangeDenominations.Nickel.plusOne();
                changeDue -= 5;
            } else if (changeDue >= 1) {
                ChangeDenominations.Penny.plusOne();
                changeDue -= 1;
            } else {
                changeDue -= 1;
            }
        }

        Tools.println("Here is your change! Thanks!");

        for (ChangeDenominations change: ChangeDenominations.values()) {

            String denomination;

            if (change.getCount() > 1) {
                denomination = change.plural(change.name());
            } else {
                denomination = change.name();
            }

            Tools.println(denomination + " : " + change.getCount());
        }
    }
}
