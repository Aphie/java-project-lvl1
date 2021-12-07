package hexlet.code;

import java.util.Random;

public class Calculator {
    public static void checkCalculations(String userName, int attemptsCount) throws NumberFormatException {
        System.out.println("What is the result of the expression?");
        Random random = new Random();
        String[] signs = {"+", "-", "*"};
        int checkResult = 0;
        final int maxNumbers = 100;

        for (int i = 0; i < attemptsCount; i++) {
            int randomNumberOne = random.nextInt(maxNumbers);
            int randomNumberTwo = random.nextInt(maxNumbers);
            int randomSign = random.nextInt(signs.length);
            System.out.println("Question: " + randomNumberOne + signs[randomSign] + randomNumberTwo);

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            int calculationResult = calculate(randomNumberOne, randomNumberTwo, signs[randomSign]);

            try {
                if (Integer.parseInt(answer) == calculationResult) {
                    System.out.println("Correct!");
                    checkResult++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                            + calculationResult + "'.\nLet's try again, " + userName + "!");
                    i = attemptsCount;
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered wrong data. Have to quit");
                break;
            }

            Congratulations.congratulationsMessage(attemptsCount, checkResult, userName);
        }
    }
    public static int calculate(int numberOne, int numberTwo, String sign) {
        if (sign.equals("+")) {
            return numberOne + numberTwo;
        } else if (sign.equals("-")) {
            return numberOne - numberTwo;
        } else {
            return numberOne * numberTwo;
        }
    }
}