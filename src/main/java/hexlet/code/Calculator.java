package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calculator {
    public static void checkCalculations(String userName) {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        String[] signs = {"+", "-", "*"};
        int checkResult = 0;
        final int attemptsCount = 3;
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumberOne = random.nextInt(maxNumbers);
            int randomNumberTwo = random.nextInt(maxNumbers);
            int randomSign = random.nextInt(signs.length);
            System.out.println("Question: " + randomNumberOne + signs[randomSign] + randomNumberTwo);

            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            System.out.println("Your answer: " + answer);

            int calculationResult = calcutate(randomNumberOne, randomNumberTwo, signs[randomSign]);

            if (Integer.parseInt(answer) == calculationResult) {
                System.out.println("Correct!");
                checkResult++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + calculationResult + "'.\nLet's try again, " + userName + "!");
                i = attemptsCount;
            }

            if (checkResult == attemptsCount) {
                System.out.println("Congratulations, " + userName + "!");
            }
        }
    }
    public static int calcutate(int numberOne, int numberTwo, String sign) {
        if (sign.equals("+")) {
            return numberOne + numberTwo;
        } else if (sign.equals("-")) {
            return numberOne - numberTwo;
        } else {
            return numberOne * numberTwo;
        }
    }
}
