package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCDGame extends Engine {

    public void gcd(String name) {

        System.out.println("Find the greatest common divisor of given numbers.");
        this.runGame(name);
    }

    @Override
    public void runGame(String name) {


        for (int count = 1; count < 4; count++) {

            Random random = new Random();
            Scanner console = new Scanner(System.in);

            int x = 1 + random.nextInt(100);
            int y = 1 + random.nextInt(100);

            String result = Integer.toString(this.maxDiv(x, y));


            System.out.println("Question: " + x + " " + y);

            String answer = console.nextLine();

            System.out.println("Your answer: " + answer);


            if (answer.equals(result)) {
                System.out.println("Correct!");

                if (count == 3) {
                    System.out.println("Congratulations, " + name + "!");
                    return;
                }

            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ". "  +
                        "Let's try again, " + name + "!");
                return;
            }
        }
    }

    private int maxDiv(int x, int y) {

            while (y != 0) {
                int tmp = x % y;
                x = y;
                y = tmp;
            }
            return x;
        }

}
