package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.EvenGame;
import hexlet.code.games.NumberIsPrimeGame;
import hexlet.code.games.GCDGame;
import hexlet.code.games.CalcGame;
import hexlet.code.games.ProgressionGame;

public class App {
    public static void main(final String[] args) throws Exception {

        printMenu();
        choiceGame();
    }

    private static void printMenu() {

        String welcomeText = "Please enter the game number and press Enter.\n"
                .concat("1 - Greet\n")
                .concat("2 - Even\n")
                .concat("3 - Calc\n")
                .concat("4 - GCD\n")
                .concat("5 - Progression\n")
                .concat("6 - Prime\n")
                .concat("0 - Exit\n")
                .concat("Your choice: ");

        System.out.println(welcomeText);
    }

    private static void choiceGame() throws Exception {

        Scanner console = new Scanner(System.in);
        String numGame = console.nextLine();

        switch (numGame) {
            case "0":
                break;
            case "1":
                Cli.userName();
                break;
            case "2":
                Engine.runGame(
                        EvenGame::getDescription,
                        EvenGame::getQuestion,
                        EvenGame::getCorrectAnswer
                );
                break;
            case "3":
                Engine.runGame(
                        CalcGame::getDescription,
                        CalcGame::getQuestion,
                        CalcGame::getCorrectAnswer
                );
                break;
            case "4":
                Engine.runGame(
                        GCDGame::getDescription,
                        GCDGame::getQuestion,
                        GCDGame::getCorrectAnswer
                );
                break;
            case "5":
                Engine.runGame(
                        ProgressionGame::getDescription,
                        ProgressionGame::getQuestion,
                        ProgressionGame::getCorrectAnswer
                );
                break;
            case "6":
                Engine.runGame(
                        NumberIsPrimeGame::getDescription,
                        NumberIsPrimeGame::getQuestion,
                        NumberIsPrimeGame::getCorrectAnswer
                );
                break;
            default:
                throw new Exception("Unexpected Game Number: ".concat(numGame));
        }
    }
}
