package hexlet.code.games;

import hexlet.code.Congratulations;
import hexlet.code.UsersAnswer;

import java.util.Random;

public class PrimeNumber {
    public static void checkPrimeNumber(String userName, int attemptsCount) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Random random = new Random();
        int checkResult = 0;
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumber = random.nextInt(maxNumbers);
            System.out.println("Question: " + randomNumber);

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            if (((isPrimeNumber(randomNumber)) && (answer.equals("yes")))
                    || ((!isPrimeNumber(randomNumber)) && (answer.equals("no")))) {
                System.out.println("Correct!");
                checkResult++;
            } else if (((!isPrimeNumber(randomNumber)) && (answer.equals("yes")))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName + "!");
                i = attemptsCount;
            } else if (((isPrimeNumber(randomNumber)) && (answer.equals("no")))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.\n"
                        + "Let's try again, " + userName + "!");
                i = attemptsCount;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer were either 'yes' or 'no'.\n"
                        + "Let's try again, " + userName + "!");
                i = attemptsCount;
            }
        }

        Congratulations.congratulationsMessage(attemptsCount, checkResult, userName);

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
