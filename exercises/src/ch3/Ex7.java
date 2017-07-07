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
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Tools.print("Enter the total price: $");

        //add error catch
        double total = input.nextDouble();

        Tools.print("Enter the customer payment amount: $");

        //add error catch
        double payment = input.nextDouble();

        while (payment < total) {
            Tools.println("I'm sorry, that payment is not enough.");
            Tools.println("Please enter the new customer payment amount: $");
            payment = input.nextDouble();
        }

        Tools.println("Calculating change due ...");

        double changeDue = payment - total;

        while (changeDue >= 0.009) {
            if (changeDue >= 1.0) {
                ChangeDenominations.Dollar.plusOne();
                changeDue -= 1.0;
            } else if (changeDue >= .25) {
                ChangeDenominations.Quarter.plusOne();
                changeDue -=.25;
            } else if (changeDue >= .10) {
                ChangeDenominations.Dime.plusOne();
                changeDue -= .10;
            } else if (changeDue >= .05) {
                ChangeDenominations.Nickel.plusOne();
                changeDue -= .05;
            } else if (changeDue >= .01) {
                ChangeDenominations.Penny.plusOne();
                changeDue -= .01;
            } else {
                changeDue -= .01;
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
