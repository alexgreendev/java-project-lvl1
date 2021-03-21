package hexlet.code.games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class EvenGame extends Engine{

    public void even(String name) {

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        this.runGame(name);

    }
    @Override
    public void runGame(String name) {

        for(int count = 1; count < 4; count++) {

            Random random = new Random();
            int x = 1 + random.nextInt(25);
            System.out.println("Question: " + x);

            Scanner console = new Scanner(System.in);
            String answer = console.nextLine();

            System.out.println("Your answer: " + answer);

            if (x % 2 == 0 && answer.equals("yes") || x % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");

                if (count == 3) {
                    System.out.println("Congratulations, " + name + "!");
                    return;
                }

            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + name + "!");
                return;
            }
        }
    }
}
