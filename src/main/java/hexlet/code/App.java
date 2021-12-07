package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");


        final int greetMenu = 1;
        final int evenGame = 2;
        final int calculationGame = 3;
        final int gcdGame = 4;
        final int exitGame = 0;
        final int attemptsCount = 3;

        String userChoice = UsersAnswer.answer();
        System.out.println("Your choice: " + userChoice);
        System.out.println();

        int userChoiceInt = Integer.parseInt(userChoice);

        switch (userChoiceInt) {
            case greetMenu:
                String userName = Cli.welcomeMessage();
                break;
            case evenGame:
                userName = Cli.welcomeMessage();
                EvenNumbers.checkEvenNumbers(userName, attemptsCount);
                break;
            case calculationGame:
                userName = Cli.welcomeMessage();
                Calculator.checkCalculations(userName, attemptsCount);
                break;
            case gcdGame:
                userName = Cli.welcomeMessage();
                CommonDivisor.checkCommonDivisor(userName, attemptsCount);
                break;
            case exitGame:
                break;
            default:
                System.out.println("I'm sorry. I can't do this right now. Have to quit");
        }


    }
}
