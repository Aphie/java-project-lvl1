package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";

    public static void checkProgression() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        int progressionLength;
        final int startProgression = 5;

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {

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
        System.out.println(Engine.launchGame(RULES, results));
    }
    public static int[] createProgression(int progressionLength) {
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = Utils.generateRandom();
        progressionNumbers[1] = Utils.generateRandom();

        int progressionStep = progressionNumbers[1] - progressionNumbers[0];

        for (int i = 2; i < progressionLength; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        return progressionNumbers;
    }
}
