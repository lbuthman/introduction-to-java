package ch2;

import java.util.Scanner;
import tools.*;

/**
 * (Convert Celsius to Fahrenheit)
 */

public class Ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Tools.print("Enter a degree in Celsius: ");

        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5) * celsius + 32;

        Tools.print(celsius + " Celsius is " + fahrenheit + " degrees Fahrenheit.");
    }
}