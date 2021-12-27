package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ATTEMPTSCOUNT = 3;

    public static String launchGame(String rules, String[][] results) {
        String userName = Cli.welcomeMessage();

        System.out.println(rules);

        for (int i = 0; i < ATTEMPTSCOUNT; i++) {
            System.out.println("Question: " + results[i][0]);

            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
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
