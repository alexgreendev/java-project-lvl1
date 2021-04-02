package hexlet.code;

import java.util.Scanner;
import java.util.concurrent.Callable;


public class Engine {

    private static Scanner console = new Scanner(System.in);
    public static final int ROUND_COUNT = 3;

    public static <T> void runGame(

            final Callable<String> getDescription,
            final Callable<String> getQuestion,
            final Callable<String> getCorrectAnswer) throws Exception {

        System.out.println("Welcome to the Brain Games! "
                .concat("\nMay I have your name? "));

        String name = console.nextLine();

        String text = name + "\nHello, " + name + "!";
        System.out.println(text);


        System.out.println(getDescription.call());

        for (int count = 0; count < ROUND_COUNT; count++) {
            System.out.println("Question: " + getQuestion.call());

            String answer = console.nextLine();
            System.out.println("Your answer: " + answer);

            if (!answer.equals(getCorrectAnswer.call())) {
                System.out.println(answer
                        .concat(" is wrong answer ;(. Correct answer was ")
                        .concat(getCorrectAnswer.call()).concat(".")
                        .concat(" Let's try again, ") .concat(name + "!"));
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
