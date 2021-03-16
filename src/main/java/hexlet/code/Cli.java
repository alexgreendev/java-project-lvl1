package hexlet.code;

import java.util.Scanner;

import java.util.Scanner;

public class Cli {

    public static String games() {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String text = "Welcome to the Brain Games! " + "\nMay I have your name? " + name + "\nHello, " + name + "!";
        System.out.println(text);
        return text;

    }
}
