package hexlet.code;


import java.util.Scanner;

import hexlet.code.games.*;

public class App {
    public static void main(String[] args) throws Exception {

        printMenu();
        choiceGame();
    }

    private static void printMenu() {

        String welcomeText = "Please enter the game number and press Enter." + "\n1 - Greet" + "\n2 - Even" +
                "\n3 - Calc" + "\n4 - GCD" + "\n5 - Progression" + "\n6 - Prime" +
                "\n0 - Exit" + "\nYour choice: ";

        System.out.println(welcomeText);
    }

    private static void choiceGame() throws Exception {

        Scanner console = new Scanner(System.in);
        int numGame = console.nextInt();

        switch (numGame) {
            case 0:
                break;
            case 1:
                Cli.userName();
                break;
            case 2:
                Engine.runGame(
                        EvenGame::getDescription,
                        EvenGame::getQuestion,
                        EvenGame::getCorrectAnswer
                );
                break;
            case 3:
                Engine.runGame(
                        CalcGame::getDescription,
                        CalcGame::getQuestion,
                        CalcGame::getCorrectAnswer
                );
                break;
            case 4:
                Engine.runGame(
                        GCDGame::getDescription,
                        GCDGame::getQuestion,
                        GCDGame::getCorrectAnswer
                );
                break;
            case 5:
                Engine.runGame(
                        ProgressionGame::getDescription,
                        ProgressionGame::getQuestion,
                        ProgressionGame::getCorrectAnswer
                );
                break;
            case 6:
                Engine.runGame(
                        NumberIsPrimeGame::getDescription,
                        NumberIsPrimeGame::getQuestion,
                        NumberIsPrimeGame::getCorrectAnswer
                );
                break;
        }
    }
}