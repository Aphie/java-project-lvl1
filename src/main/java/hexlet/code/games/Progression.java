package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static final String RULES = "What number is missing in the progression?";
    public static final int PROGRESSIONMAXSTEP = 50;

    public static void runProgression() {
        final int resultArraySize = 2;
        String[][] results = new String[Engine.ATTEMPTSCOUNT][resultArraySize];

        int progressionLength;
        final int startProgression = 5;

        for (int i = 0; i < Engine.ATTEMPTSCOUNT; i++) {

            progressionLength = startProgression + (int) (Math.random() * startProgression);
            int[] progressionNumbers = new int[progressionLength];
            int firstProgressionElement = Utils.generateRandom();
            int progressionStep = Utils.generateRandom(PROGRESSIONMAXSTEP);
            progressionNumbers = createProgression(firstProgressionElement, progressionStep, progressionLength);

            int randomMissingNumber = (int) (Math.random() * progressionLength);

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

