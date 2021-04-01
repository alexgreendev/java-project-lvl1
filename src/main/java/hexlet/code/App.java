package hexlet.code;


import java.util.Scanner;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) {

        printMenu();
        choiceGame();
    }

    private static void printMenu() {

        String welcomeText = "Please enter the game number and press Enter." + "\n1 - Greet" + "\n2 - Even" +
                "\n3 - Calc" + "\n4 - GCD" + "\n5 - Progression" + "\n6 - Prime" +
                "\n0 - Exit" + "\nYour choice: ";

        System.out.println(welcomeText);
    }

    private static void choiceGame() {

        Scanner console = new Scanner(System.in);
        int numGame = console.nextInt();

        String userName = Cli.userName();

        switch (numGame) {
            case 0:
                break;
            case 1:
                Cli.userName();
                break;
            case 2:
                EvenGame evenGame = new EvenGame();
                evenGame.runGame(userName);
                break;
            case 3:
                CalcGame calcGame = new CalcGame();
                calcGame.runGame(userName);
                break;
            case 4:
                GCDGame gcdGame = new GCDGame();
                gcdGame.runGame(userName);
                break;
            case 5:
                ProgressionGame progressionGame = new ProgressionGame();
                progressionGame.runGame(userName);
                break;
            case 6:
                NumberIsPrimeGame numberIsPrimeGame = new NumberIsPrimeGame();
                numberIsPrimeGame.runGame(userName);
                break;
        }
    }
}