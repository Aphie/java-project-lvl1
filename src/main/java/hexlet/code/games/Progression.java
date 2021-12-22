package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    public static void checkProgression(int attemptsCount) {
        final int resultArraySize = 2;
        String[][] results = new String[attemptsCount][resultArraySize];
        String rules = "What number is missing in the progression?";

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
            results[i][0] = progressionNumbersToString[0] + " ";

            for (int k = 1; k < progressionLength; k++) {
                results[i][0] += progressionNumbersToString[k] + " ";
            }
            results[i][1] = Integer.toString(progressionNumbers[randomMissingNumber]);

        }
        Engine.launchGame(rules, results, attemptsCount);
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
