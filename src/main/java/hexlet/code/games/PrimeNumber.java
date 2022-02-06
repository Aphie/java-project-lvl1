package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class PrimeNumber {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeNumber() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {
            int randomNumber = Utils.generateRandom();
            results[i][0] = Integer.toString(randomNumber);
            results[i][1] = isPrimeNumber(randomNumber) ? "yes" : "no";
        }
        System.out.println(Engine.launchGame(RULES, results));

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
