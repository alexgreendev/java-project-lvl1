package hexlet.code.games;

import java.util.Random;


public class GCDGame {
    private static String correctAnswer;

    public static String getDescription() {
        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        Random random = new Random();
        int x = 1 + random.nextInt(100);
        int y = 1 + random.nextInt(100);

        correctAnswer = Integer.toString(maxDiv(x, y));

        return x + " " + y;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static int maxDiv(int x, int y) {

            while (y != 0) {
                int tmp = x % y;
                x = y;
                y = tmp;
            }
            return x;
    }

}
