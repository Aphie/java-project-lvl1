package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static void checkCalculations(int attemptsCount) throws NumberFormatException {
        final int resultArraySize = 2;
        String[][] results = new String[attemptsCount][resultArraySize];
        String rules = "What is the result of the expression?";
        Random random = new Random();
        String[] signs = {"+", "-", "*"};
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumberOne = random.nextInt(maxNumbers);
            int randomNumberTwo = random.nextInt(maxNumbers);
            int randomSign = random.nextInt(signs.length);
            results[i][0] = randomNumberOne + " " + signs[randomSign] + " " + randomNumberTwo;
            results[i][1] = Integer.toString(calculate(randomNumberOne, randomNumberTwo, signs[randomSign]));
        }
        Engine.launchGame(rules, results, attemptsCount);
    }
    public static int calculate(int numberOne, int numberTwo, String sign) {
        if (sign.equals("+")) {
            return numberOne + numberTwo;
        } else if (sign.equals("-")) {
            return numberOne - numberTwo;
        } else {
            return numberOne * numberTwo;
        }
    }
}
