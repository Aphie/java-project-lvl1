package hexlet.code;

public class CheckResult {
    public static boolean checkResultOfGame(String answer, int calculationResult, String userName) {
        boolean isCorrect = false;
        try {
            if (Integer.parseInt(answer) == calculationResult) {
                System.out.println("Correct!");
                isCorrect = true;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + calculationResult + "'.\nLet's try again, " + userName + "!");
            }
        } catch (NumberFormatException e) {
            System.out.println("You entered wrong data. Have to quit");
        }
        return isCorrect;
    }
}
