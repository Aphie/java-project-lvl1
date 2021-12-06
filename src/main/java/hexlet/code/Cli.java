package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcomeMessage() {
        Scanner in = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = in.nextLine();
        System.out.println("Hello, " + userName + '!');
    }
}
