package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public class GCDGame extends Engine {
    private String correctAnswer;

    public String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getQuestion() {
        Random random = new Random();
        int x = 1 + random.nextInt(100);
        int y = 1 + random.nextInt(100);

        correctAnswer = Integer.toString(this.maxDiv(x, y));

        return x + " " + y;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
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
