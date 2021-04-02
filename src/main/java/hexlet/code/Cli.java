package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void userName() {

        System.out.println("Welcome to the Brain Games! "
                        .concat("\nMay I have your name? "));

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        String text = name + "\nHello, " + name + "!";
        System.out.println(text);
    }
}
