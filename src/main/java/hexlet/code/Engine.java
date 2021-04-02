package hexlet.code;


import java.util.Scanner;
import java.util.concurrent.Callable;


public class Engine {

    public static Scanner console = new Scanner(System.in);

    public static <T> void runGame(

            Callable<String> getDescription,
            Callable<String> getQuestion,
            Callable<String> getCorrectAnswer) throws Exception {

        System.out.println("Welcome to the Brain Games! " + "\nMay I have your name? ");

        String name = console.nextLine();

        String text = name + "\nHello, " + name + "!";
        System.out.println(text);


        System.out.println(getDescription.call());

        for(int count = 1; count < 4; count++) {

            System.out.println("Question: " + getQuestion.call());

            String answer = console.nextLine();
            System.out.println("Your answer: " + answer);

            if (!answer.equals(getCorrectAnswer.call())) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + getCorrectAnswer.call() + "." +
                        " Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
