package hexlet.code;

import java.util.Random;

public class CommonDivisor {
    public static void checkCommonDivisor(String userName, int attemptsCount) throws NumberFormatException {
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();
        int checkResult = 0;
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumberOne = random.nextInt(maxNumbers);
            int randomNumberTwo = random.nextInt(maxNumbers);
            System.out.println("Question: " + randomNumberOne + " " + randomNumberTwo);

            int calculationResult = findCommonDivisor(randomNumberOne, randomNumberTwo);

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            if (CheckResult.checkResultOfGame(answer, calculationResult, userName)) {
                checkResult++;
            } else {
                i = attemptsCount;
            }
        }
        Congratulations.congratulationsMessage(attemptsCount, checkResult, userName);
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
