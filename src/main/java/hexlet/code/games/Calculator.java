package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calculator {
    public static final String RULES = "What is the result of the expression?";

    public static void checkCalculations() throws NumberFormatException {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];
        Random random = new Random();
        String[] signs = {"+", "-", "*"};

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {
            int randomNumberOne = Utils.generateRandom();
            int randomNumberTwo = Utils.generateRandom();
            int randomSign = random.nextInt(signs.length);
            results[i][0] = randomNumberOne + " " + signs[randomSign] + " " + randomNumberTwo;
            results[i][1] = Integer.toString(calculate(randomNumberOne, randomNumberTwo, signs[randomSign]));
        }
        System.out.println(Engine.launchGame(RULES, results));
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
