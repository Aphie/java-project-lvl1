package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ATTEMPTSCOUNT = 3;

    public static String launchGame(String rules, String[][] results) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner inUserName = new Scanner(System.in);
        String userName = inUserName.nextLine();
        System.out.println("Hello, " + userName + '!');

        System.out.println(rules);

        for (int i = 0; i < ATTEMPTSCOUNT; i++) {
            System.out.println("Question: " + results[i][0]);

            Scanner inAnswer = new Scanner(System.in);
            String answer = inAnswer.nextLine();
            System.out.println("Your answer: " + answer);

            if (answer.equals(results[i][1])) {
                System.out.println("Correct!");
            } else {
                return ("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + results[i][1] + "'.\nLet's try again, " + userName + "!");
            }
        }
        return ("Congratulations, " + userName + "!");
    }
}
