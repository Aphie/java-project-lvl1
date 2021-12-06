package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenNumbers {
    public static void checkEvenNumbers(String userName) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();
        int checkResult = 0;

        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt();
            System.out.println("Question: " + randomNumber);

            Scanner in = new Scanner(System.in);
            String answer = in.nextLine();
            System.out.println("Your answer: " + answer);

            if (((randomNumber % 2 == 0) && (answer.equals("yes"))) || ((randomNumber % 2 != 0) && (answer.equals("no")))) {
                System.out.println("Correct!");
                checkResult ++;
            } else if (((randomNumber % 2 != 0) && (answer.equals("yes")))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                i = 3;
            } else if (((randomNumber % 2 == 0) && (answer.equals("no")))) {
                System.out.println("'no' is wrong answer ;(. Correct answer was 'yes'.");
                i = 3;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer were either 'yes' or 'no'.");
                i = 3;
            }
        }

        if (checkResult == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

}