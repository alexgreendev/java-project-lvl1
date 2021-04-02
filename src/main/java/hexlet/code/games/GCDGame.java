package hexlet.code.games;

import java.util.Random;


public class GCDGame {

    private static String correctAnswer;
    private static final int NUM_RANDOM = 100;

    public static String getDescription() {

        return "Find the greatest common divisor of given numbers.";
    }

    public static String getQuestion() {
        Random random = new Random();
        final int x = 1 + random.nextInt(NUM_RANDOM);
        final int y = 1 + random.nextInt(NUM_RANDOM);

        correctAnswer = Integer.toString(maxDiv(x, y));

        return x + " " + y;
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

    private static int maxDiv(final int a, final int b) {

        int x = a;
        int y = b;

        while (y != 0) {
            int tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }
}
