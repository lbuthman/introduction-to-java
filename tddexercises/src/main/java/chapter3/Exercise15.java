package chapter3;

import tools.Tools;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Game: lottery
 */
public class Exercise15 {
    public static void main(String[] args) {

        Scanner input = Tools.getScanner();
        Tools.println("Let's play the lottery! Hope you feel lucky.");

        int lottoDigitCount = 3;
        Lotto lotto = new Lotto(lottoDigitCount);

        Integer[] answers = new Integer[lottoDigitCount];

        for (int i=0; i<lottoDigitCount; i++) {
            Tools.print("Enter your guess for digit " + (i + 1) + ": ");
            answers[i] = input.nextInt();
        }

        Tools.println("Lotto drawing is starting number!");
        lotto.drawSecretNumber();
        Tools.println("The lotto drawings have completed. Please wait while we see if you won ...");

        int correctDigits = 0;
        int prize = 0;

        for (int i=0; i<lottoDigitCount; i++) {
            for (int j=0; j<lottoDigitCount; j++) {
                if (answers[j].equals(lotto.getSecretNumber()[i])) {
                    correctDigits++;
                    break;
                }
            }
        }

        if (Arrays.equals(lotto.getSecretNumber(), answers)) {
            prize = lotto.EXACT_MATCH_PRIZE;

        } else if (correctDigits >= 3) {
            prize = lotto.ALL_DIGIT_MATCH_PRIZE;

        } else if (correctDigits >= 1) {
            prize = lotto.ONE_DIGIT_MATCH_PRIZE;
        }

        Tools.println("Ok! The winning Lotto number was " + Arrays.toString(lotto.getSecretNumber()));
        Tools.println("Your guess was " + Arrays.toString(answers));
        Tools.println("You got " + correctDigits + " digits correct and won $" + prize + " dollars.");

    }
}

class Lotto {

    final int EXACT_MATCH_PRIZE = 10000;
    final int ALL_DIGIT_MATCH_PRIZE = 3000;
    final int ONE_DIGIT_MATCH_PRIZE = 1000;

    private int numOfDigits;

    private Integer[] secretNumber;

    Lotto(int numOfDigits) {
        this.numOfDigits = numOfDigits;
    }

    Integer[] getSecretNumber() {
        return secretNumber;
    }

    void drawSecretNumber() {

        initializeSecretNumber();
        for (int i=0, n=numOfDigits; i<n; i++) {
            secretNumber[i] = (int) ((Math.random() * 100 + 1) / 10) ;
        }
    }

    private void initializeSecretNumber() {
        secretNumber = new Integer[numOfDigits];
    }
}
