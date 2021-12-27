package hexlet.code.games;

import hexlet.code.Engine;

public class EvenNumbers {
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void checkEvenNumbers() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        for (int i = 0; i < results.length; i++) {
            int randomNumber = Utils.generateRandom();
            results[i][0] = Integer.toString(randomNumber);
            if (randomNumber % 2 == 0) {
                results[i][1] = "yes";
            } else {
                results[i][1] = "no";
            }
        }

        System.out.println(Engine.launchGame(RULES, results));
    }
}
