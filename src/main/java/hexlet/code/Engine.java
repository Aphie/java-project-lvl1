package hexlet.code;

public class Engine {
    public static void launchGame(String rules, String[][] results, int attemptsCount) {
        int checkResult = 0;
        String userName = Cli.welcomeMessage();

        System.out.println(rules);

        for (int i = 0; i < attemptsCount; i++) {
            System.out.println("Question: " + results[i][0]);

            String answer = UsersAnswer.answer();
            System.out.println("Your answer: " + answer);

            if (answer.equals(results[i][1])) {
                System.out.println("Correct!");
                checkResult++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + results[i][1] + "'.\nLet's try again, " + userName + "!");
                i = attemptsCount;
            }

            Congratulations.congratulationsMessage(attemptsCount, checkResult, userName);

        }
    }
}
