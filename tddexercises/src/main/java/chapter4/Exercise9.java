package chapter4;

import java.util.Scanner;
import static tools.Tools.*;

/**
 * Find the Unicode of a character
 */
public class Exercise9 {

    public static void main(String[] args) {

        Scanner input = getScanner();
        print("Enter a character: ");
        String c = input.next();
        println("The unicode for character " + c + " is " + c.codePointAt(0));
    }
}
