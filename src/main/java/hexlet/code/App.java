package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        Scanner usersInput = new Scanner(System.in);
        String userChoice = usersInput.nextLine();
        System.out.println("Your choice: " + userChoice);
        System.out.println();

        int userChoiceInt = Integer.parseInt(userChoice);

        switch (userChoiceInt) {
            case 1:
                String userName = Cli.welcomeMessage();
                break;
            case 2:
                userName = Cli.welcomeMessage();
                EvenNumbers.checkEvenNumbers(userName);
                break;
            case 3:
                userName = Cli.welcomeMessage();
                Calculator.checkCalculations(userName);
                break;
            default:
                System.out.println("I'm sorry. I can't do this right now. Have to quit");
        }


    }
}
