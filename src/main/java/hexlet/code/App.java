package hexlet.code;


import java.util.Scanner;
import hexlet.code.EvenGame;

public class App {
    public static void main(String[] args) {

        String welcomeText = "Please enter the game number and press Enter." + "\n1 - Greet" + "\n2 - Even" +
                "\n0 - Exit" + "\nYour choice: ";
        System.out.println(welcomeText);

        Scanner console = new Scanner(System.in);
        int numGame = console.nextInt();

        if (numGame == 1) {
            System.out.println("Welcome to the Brain Games! " + "\nMay I have your name? ");
            Cli.userName();
        }
        if (numGame == 2) {
            System.out.println("Welcome to the Brain Games! " + "\nMay I have your name? ");
            String userName = Cli.userName();

            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

            EvenGame evenGame = new EvenGame();
            evenGame.even(userName);
        } else if (numGame == 0) {
            return;
        }
    }
}