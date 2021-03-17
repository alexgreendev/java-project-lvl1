package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String userName() {

        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        String text = name + "\nHello, " + name + "!";
        System.out.println(text);
        return name;

    }
}
