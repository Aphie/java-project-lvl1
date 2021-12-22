package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CommonDivisor;
import hexlet.code.games.EvenNumbers;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        String userChoice = UsersAnswer.answer();
        System.out.println("Your choice: " + userChoice);
        System.out.println();

        int userChoiceInt = Integer.parseInt(userChoice);

        final int greetMenu = 1;
        final int evenGame = 2;
        final int calculationGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;
        final int exitGame = 0;

        final int attemptsCount = 3;

        switch (userChoiceInt) {
            case greetMenu:
                String userName = Cli.welcomeMessage();
                break;
            case evenGame:
                EvenNumbers.checkEvenNumbers(attemptsCount);
                break;
            case calculationGame:
                Calculator.checkCalculations(attemptsCount);
                break;
            case gcdGame:
                CommonDivisor.checkCommonDivisor(attemptsCount);
                break;
            case progressionGame:
                Progression.checkProgression(attemptsCount);
                break;
            case primeGame:
                PrimeNumber.checkPrimeNumber(attemptsCount);
                break;
            case exitGame:
                break;
            default:
                System.out.println("I'm sorry. I can't do this right now. Have to quit");

        }
    }
}

