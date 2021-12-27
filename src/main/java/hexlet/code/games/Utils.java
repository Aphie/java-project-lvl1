package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static final int MAXNUMBERS = 100;
    public static int generateRandom() {
        Random random = new Random();
        return random.nextInt(MAXNUMBERS);
    }
}
