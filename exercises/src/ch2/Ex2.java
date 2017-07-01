package ch2;

import tools.*;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Compute the volume of a cylinder
 */

public class Ex2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat dfShort = new DecimalFormat("0.0");
        DecimalFormat dfLong = new DecimalFormat("0.0000");

        Tools.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        Tools.println("The area is " + dfLong.format(area));
        Tools.println("The volume is " + dfShort.format(volume));
    }
}
