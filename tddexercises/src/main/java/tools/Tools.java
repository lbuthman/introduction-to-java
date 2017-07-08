package tools;

import java.util.Scanner;

/**
 * Static tools to help with DRY principle
 */
public class Tools {

    public static void print(String s) {
        System.out.print(s);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static Scanner getScanner() { return new Scanner(System.in); }
}
