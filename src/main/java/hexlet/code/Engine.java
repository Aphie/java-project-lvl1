package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ATTEMPTS_COUNT = 3;

    public static String launchGame(String rules, String[][] questionsToAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inUserAnswer = new Scanner(System.in);
        String userName = inUserAnswer.nextLine();
        System.out.println("Hello, " + userName + '!');

        System.out.println(rules);

        for (int i = 0; i < ATTEMPTS_COUNT; i++) {
            System.out.println("Question: " + questionsToAnswers[i][0]);

            String answer = inUserAnswer.nextLine();
            System.out.println("Your answer: " + answer);

            if (answer.equals(questionsToAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                return ("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + questionsToAnswers[i][1] + "'.\nLet's try again, " + userName + "!");
            }
        }
        return ("Congratulations, " + userName + "!");
    }
}
