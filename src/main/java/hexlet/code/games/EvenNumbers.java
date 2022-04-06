package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class EvenNumbers {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runEvenNumbers() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTS_COUNT][resultArraySize];

        for (int i = 0; i < results.length; i++) {
            int randomNumber = Utils.generateRandom();
            results[i][0] = Integer.toString(randomNumber);
            results[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }

        System.out.println(Engine.launchGame(RULES, results));
    }
}
