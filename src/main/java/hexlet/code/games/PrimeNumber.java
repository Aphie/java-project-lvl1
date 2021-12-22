package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeNumber {
    public static void checkPrimeNumber(int attemptsCount) {
        final int resultArraySize = 2;
        String[][] results = new String[attemptsCount][resultArraySize];
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Random random = new Random();

        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumber = random.nextInt(maxNumbers);
            results[i][0] = Integer.toString(randomNumber);

            if (isPrimeNumber(randomNumber)) {
                results[i][1] = "yes";
            } else {
                results[i][1] = "no";
            }
        }
        Engine.launchGame(rules, results, attemptsCount);

    }
    public static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return (number > 1);
    }
}
