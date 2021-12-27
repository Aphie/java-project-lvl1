package hexlet.code;

import hexlet.code.games.Calculator;
import hexlet.code.games.CommonDivisor;
import hexlet.code.games.EvenNumbers;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    static final String GREETMENU = "1";
    static final String EVENGAME = "2";
    static final String CALCULATIONGAME = "3";
    static final String GCDGAME = "4";
    static final String PROGRESSIONGAME = "5";
    static final String PRIMEGAME = "6";
    static final String EXITGAME = "0";

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
        System.out.println("Your choice: " + userChoice);
        System.out.println();

        switch (userChoice) {
            case GREETMENU:
                String userName = Cli.welcomeMessage();
                break;
            case EVENGAME:
                EvenNumbers.checkEvenNumbers();
                break;
            case CALCULATIONGAME:
                Calculator.checkCalculations();
                break;
            case GCDGAME:
                CommonDivisor.checkCommonDivisor();
                break;
            case PROGRESSIONGAME:
                Progression.checkProgression();
                break;
            case PRIMEGAME:
                PrimeNumber.checkPrimeNumber();
                break;
            case EXITGAME:
                break;
            default:
                System.out.println("I'm sorry. I can't do this right now. Have to quit");

        }
    }
}

