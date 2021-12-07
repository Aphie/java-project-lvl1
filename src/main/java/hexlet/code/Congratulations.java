package hexlet.code;

public class Congratulations {
    public static void congratulationsMessage(int attemptsCount, int checkResult, String userName) {
        if (checkResult == attemptsCount) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
