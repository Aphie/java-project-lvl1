package hexlet.code;

import java.util.Random;

public class Progression {
    public static void checkProgression(String userName, int attemptsCount) {
        System.out.println("What number is missing in the progression?");
        int checkResult = 0;
        int progressionLength;
        final int startProgression = 5;

        for (int i = 0; i < attemptsCount; i++) {

            progressionLength = startProgression + (int) (Math.random() * startProgression);
            int[] progressionNumbers = createProgression(progressionLength);
            int randomMissingNumber = (int) (Math.random() * progressionLength);

            String[] progressionNumbersToString = new String[progressionLength];
            for (int j = 0; j < progressionLength; j++) {
                if (j != randomMissingNumber) {
                    progressionNumbersToString[j] = Integer.toString(progressionNumbers[j]);
                } else {
                    progressionNumbersToString[j] = "..";
                }
            }

            System.out.print("Question: ");
            for (int k = 0; k < progressionLength; k++) {
                System.out.print(progressionNumbersToString[k] + " ");
            }
            System.out.println();

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            if (CheckResult.checkResultOfGame(answer, progressionNumbers[randomMissingNumber],
                    userName)) {
                checkResult++;
            } else {
                i = attemptsCount;
            }
        }
        Congratulations.congratulationsMessage(attemptsCount, checkResult, userName);
    }
    public static int[] createProgression(int progressionLength) {
        final int maxNumberInProgression = 100;
        Random random = new Random();
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = random.nextInt(maxNumberInProgression);
        progressionNumbers[1] = random.nextInt(maxNumberInProgression);

        int progressionStep = progressionNumbers[1] - progressionNumbers[0];

        for (int i = 2; i < progressionLength; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        return progressionNumbers;
    }
}
