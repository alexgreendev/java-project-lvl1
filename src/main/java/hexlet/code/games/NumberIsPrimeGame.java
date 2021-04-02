package hexlet.code.games;

import java.util.Random;

public class NumberIsPrimeGame {

    private static String correctAnswer;
    private static final int NUM_RANDOM = 10;

    public static String getDescription() {

        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {

        Random random = new Random();
        int x = 1 + random.nextInt(NUM_RANDOM);

        correctAnswer = checkSimple(x);

        return String.valueOf(x);

    }

    public static String getCorrectAnswer() {

        return correctAnswer;
    }

    private static String checkSimple(final int num) {

        final int stepIncrease = 6;
        final int startNumber = 3;

        if (num <= 1) {
            return "no";
        }
        if (num > 2 && num % 2 == 0) {
            return "no";
        }

        for (int i = startNumber; i * i <= num; i += stepIncrease) {

            if (num % i == 0 || num % (i + 2) == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
