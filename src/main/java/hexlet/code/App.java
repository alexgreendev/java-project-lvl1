package hexlet.code;


import java.util.Scanner;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;

public class App {
    public static void main(String[] args) {

        String welcomeText = "Please enter the game number and press Enter." + "\n1 - Greet" + "\n2 - Even" +
                "\n3 - Calc"  + "\n4 - GCD" + "\n5 - Progression" + "\n6 - Prime" +
                "\n0 - Exit" + "\nYour choice: ";
        System.out.println(welcomeText);

        Scanner console = new Scanner(System.in);
        int numGame = console.nextInt();

        if (numGame == 1) {

            Cli.userName();
        }

        if (numGame == 2) {

            String userName = Cli.userName();

            EvenGame evenGame = new EvenGame();
            evenGame.even(userName);

        }

        if (numGame == 3) {

            String userName = Cli.userName();
            CalcGame calcGame = new CalcGame();
            calcGame.calculator(userName);

        }

        if (numGame == 4) {

            String userName = Cli.userName();



        }

        if (numGame == 5) {

            String userName = Cli.userName();



        }

        if (numGame == 6) {

            String userName = Cli.userName();



        } else if (numGame == 0) {
            return;
        }
    }
}