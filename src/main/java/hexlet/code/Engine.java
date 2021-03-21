package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public abstract class Engine {

    public void runGame(String name) {


        for (int count = 1; count <= 3; count++) {
            boolean result = true;
            Random random = new Random();
            int x = 1 + random.nextInt(25);
            System.out.println("Question: " + x);

            Scanner console = new Scanner(System.in);
            String answer = console.nextLine();

            System.out.println("Your answer: " + answer);

            if (answer.equals(result)) {
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




