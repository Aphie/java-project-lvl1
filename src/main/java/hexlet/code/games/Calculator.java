package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Random;

public class Calculator {
    public static final String RULES = "What is the result of the expression?";
    public static final char[] SIGNS = {'+', '-', '*'};

    public static void runCalculations() throws NumberFormatException {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];
        Random random = new Random();

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {
            int randomNumberOne = Utils.generateRandom();
            int randomNumberTwo = Utils.generateRandom();
            int randomSign = random.nextInt(SIGNS.length);
            results[i][0] = randomNumberOne + " " + SIGNS[randomSign] + " " + randomNumberTwo;
            results[i][1] = Integer.toString(calculate(randomNumberOne, randomNumberTwo, SIGNS[randomSign]));
        }
        System.out.println(Engine.launchGame(RULES, results));
    }
    public static int calculate(int numberOne, int numberTwo, char sign) {
        int calculationResult = -1;
        switch (sign) {
            case '+':
                calculationResult = numberOne + numberTwo;
                break;
            case '-':
                calculationResult = numberOne - numberTwo;
                break;
            case '*':
                calculationResult = numberOne * numberTwo;
                break;
            default:
                throw new Error("This sign isn't added to game yet");
        }
        return calculationResult;
    }
}
