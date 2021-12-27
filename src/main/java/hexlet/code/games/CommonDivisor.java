package hexlet.code.games;

import hexlet.code.Engine;

public class CommonDivisor {
    public static final String RULES = "Find the greatest common divisor of given numbers.";

    public static void checkCommonDivisor() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {
            int randomNumberOne = Utils.generateRandom();
            int randomNumberTwo = Utils.generateRandom();
            results[i][0] = randomNumberOne + " " + randomNumberTwo;
            results[i][1] = Integer.toString(findCommonDivisor(randomNumberOne, randomNumberTwo));
        }
        System.out.println(Engine.launchGame(RULES, results));
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
