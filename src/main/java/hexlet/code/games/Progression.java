package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static final int PROGRESSION_MAX_STEP = 50;
    public static final int MIN_PROGRESSION_LENGTH = 5;
    public static final int MAX_PROGRESSION_LENGTH = 10;

    public static void runProgression() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTS_COUNT][resultArraySize];

        for (int i = 0; i < Engine.ATTEMPTS_COUNT; i++) {

            int progressionLength = Utils.generateRandom(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_LENGTH);
            int[] progressionNumbers = new int[progressionLength];
            int firstProgressionElement = Utils.generateRandom();
            int progressionStep = Utils.generateRandom(PROGRESSION_MAX_STEP);
            progressionNumbers = createProgression(firstProgressionElement, progressionStep, progressionLength);

            int randomMissingNumber = Utils.generateRandom(progressionLength);

            results[i][0] = returnProgressionWithMissingNumber(progressionNumbers,
                    randomMissingNumber);

            results[i][1] = Integer.toString(progressionNumbers[randomMissingNumber]);
        }
        System.out.println(Engine.launchGame(RULES, results));
    }

    public static int[] createProgression(int firstProgressionElement, int progressionStep, int progressionLength) {
        int[] progressionNumbers = new int[progressionLength];
        progressionNumbers[0] = firstProgressionElement;
        for (int i = 1; i < progressionLength; i++) {
            progressionNumbers[i] = progressionNumbers[i - 1] + progressionStep;
        }
        return progressionNumbers;
    }

    public static String returnProgressionWithMissingNumber(int[] progressionNumbers, int missingElement) {
        String[] progressionNumbersToString = new String[progressionNumbers.length];
        for (int i = 0; i < progressionNumbers.length; i++) {
            if (i != missingElement) {
                progressionNumbersToString[i] = Integer.toString(progressionNumbers[i]);
            } else {
                progressionNumbersToString[i] = "..";
            }
        }
        String resultString = progressionNumbersToString[0] + " ";
        for (int i = 1; i < progressionNumbers.length; i++) {
            resultString = resultString + progressionNumbersToString[i] + " ";
        }
        return resultString;
    }
}

