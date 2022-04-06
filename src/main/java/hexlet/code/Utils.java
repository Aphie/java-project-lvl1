package hexlet.code;

import java.util.Random;

public class Utils {
    public static final int MAXNUMBERS = 100;
    public static int generateRandom() {
        Random random = new Random();
        return random.nextInt(MAXNUMBERS);
    }
    public static int generateRandom(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber);
    }

    public static int generateRandom(int minNumber, int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber - minNumber + 1) + minNumber;
    }
}
