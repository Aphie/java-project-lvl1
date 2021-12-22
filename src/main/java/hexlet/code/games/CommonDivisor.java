package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CommonDivisor {
    public static void checkCommonDivisor(int attemptsCount) {
        final int resultArraySize = 2;
        String[][] results = new String[attemptsCount][resultArraySize];
        String rules = "Find the greatest common divisor of given numbers.";
        Random random = new Random();
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumberOne = random.nextInt(maxNumbers);
            int randomNumberTwo = random.nextInt(maxNumbers);
            results[i][0] = randomNumberOne + " " + randomNumberTwo;
            results[i][1] = Integer.toString(findCommonDivisor(randomNumberOne, randomNumberTwo));
        }
        Engine.launchGame(rules, results, attemptsCount);
    }

    public static int findCommonDivisor(int numberOne, int numberTwo) {
        while (numberOne != 0 && numberTwo != 0) {
            if (numberOne > numberTwo) {
                numberOne = numberOne % numberTwo;
            } else {
                numberTwo = numberTwo % numberOne;
            }
        }
        return numberOne + numberTwo;
    }
}
