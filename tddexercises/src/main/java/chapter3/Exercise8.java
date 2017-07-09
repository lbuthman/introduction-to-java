package chapter3;

import tools.Tools;

import java.util.*;

/**
 * Sort three integers
 *
 * Test not needed since using a library solution
 */

public class Exercise8 {


    public static void main(String[] args){

        Scanner in = Tools.getScanner();

        List<Integer> numbers = new ArrayList<Integer>();

        Integer n;
        int counter = 1;
        while (true) {

            Tools.print(counter + " - Enter number: ");

            try {
                n = in.nextInt();
                numbers.add(n);
                counter++;
            }
            catch (Exception ex) { break; }

        }

        Collections.sort(numbers);
        Tools.println(numbers + "");
    }
}
