package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {

    public void even(String name){

        for(int count = 1; count < 5; count++) {

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
