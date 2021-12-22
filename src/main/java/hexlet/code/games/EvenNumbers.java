package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenNumbers {
    public static void checkEvenNumbers(int attemptsCount) {
        final int resultArraySize = 2;
        String[][] results = new String[attemptsCount][resultArraySize];
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Random random = new Random();

        for (int i = 0; i < results.length; i++) {
            int randomNumber = random.nextInt();
            results[i][0] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                results[i][1] = "yes";
            } else {
                results[i][1] = "no";
            }
        }
        Engine.launchGame(rules, results, attemptsCount);
    }
}
