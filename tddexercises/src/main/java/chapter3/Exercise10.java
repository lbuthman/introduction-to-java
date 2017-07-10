package chapter3;

import tools.Tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Game: addition quiz
 */

public class Exercise10 {
    public static void main(String[] args) {

        Quiz quiz = new Quiz("Addition Quiz 1", 5);
        List<Integer> answers = new ArrayList<Integer>();
        int score = 0;

        Scanner input = Tools.getScanner();

        Tools.println("Generating " + quiz.getQuizName() + " questions ...");

        for (int i = 0, q = quiz.getNumOfQuestions(); i < q; i++) {
            Long[] numbers = {Math.round(Math.random() * 100), Math.round(Math.random() * 100)};
            quiz.addQuestion(i, numbers);

            Tools.print("Question " + (i + 1) + ": " + numbers[0] + " + " + numbers[1] + " = ");
            answers.add(i, input.nextInt());
            long correctAnswer = numbers[0] + numbers[1];

            if (correctAnswer == answers.get(i)) {
                Tools.println("That's correct!");
                score++;
            } else {
                Tools.println("Sorry, the correct answer is " + correctAnswer);
            }
        }

        Tools.println("Nice, that completes the quiz, let's see how you did!");
        Tools.print("You got " + score + " answers correct out of " + quiz.getNumOfQuestions() + ".");

    }
}

class Quiz {

    private int numOfQuestions;
    private String quizName;
    private List<Object> questions = new ArrayList<Object>();

    Quiz(String name, int numOfQuestions) {
        this.quizName = name;
        this.numOfQuestions = numOfQuestions;
    }

    int getNumOfQuestions() {
        return numOfQuestions;
    }

    String getQuizName() {
        return quizName;
    }

    Object getQuestions(int index) {
        return questions.get(index);
    }

    void addQuestion(int index, Object[] question) {
        questions.add(index, question);
    }
}
