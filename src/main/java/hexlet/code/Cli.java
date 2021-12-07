package hexlet.code;

public class Cli {
    public static String welcomeMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = UsersAnswer.answer();
        System.out.println("Hello, " + userName + '!');
        return userName;
    }
}
