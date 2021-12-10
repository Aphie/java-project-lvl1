package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CommonDivisor;
import hexlet.code.games.EvenNumbers;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

public class Engine {
    public static void launchGame(int chosenGame) {
        final int greetMenu = 1;
        final int evenGame = 2;
        final int calculationGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;
        final int exitGame = 0;
        final int attemptsCount = 3;

        switch (chosenGame) {
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
            case progressionGame:
                userName = Cli.welcomeMessage();
                Progression.checkProgression(userName, attemptsCount);
                break;
            case primeGame:
                userName = Cli.welcomeMessage();
                PrimeNumber.checkPrimeNumber(userName, attemptsCount);
                break;
            case exitGame:
                break;
            default:
                System.out.println("I'm sorry. I can't do this right now. Have to quit");
        }
    }
}