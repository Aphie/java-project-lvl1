package hexlet.code;

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

        Engine.launchGame(userChoiceInt);
    }
}

