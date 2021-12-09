package hexlet.code.games;

import hexlet.code.Congratulations;
import hexlet.code.UsersAnswer;

import java.util.Random;

public class EvenNumbers {
    public static void checkEvenNumbers(String userName, int attemptsCount) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int checkResult = 0;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumber = random.nextInt();
            System.out.println("Question: " + randomNumber);

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            if (((randomNumber % 2 == 0) && (answer.equals("yes")))
                    || ((randomNumber % 2 != 0) && (answer.equals("no")))) {
                System.out.println("Correct!");
                checkResult++;
            } else if (((randomNumber % 2 != 0) && (answer.equals("yes")))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                        + "Let's try again, " + userName + "!");
                i = attemptsCount;
            } else if (((randomNumber % 2 == 0) && (answer.equals("no")))) {
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
}