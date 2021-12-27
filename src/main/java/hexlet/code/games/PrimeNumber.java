package hexlet.code.games;

import hexlet.code.Engine;

public class PrimeNumber {
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void checkPrimeNumber() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {
            int randomNumber = Utils.generateRandom();
            results[i][0] = Integer.toString(randomNumber);

            if (isPrimeNumber(randomNumber)) {
                results[i][1] = "yes";
            } else {
                results[i][1] = "no";
            }
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
