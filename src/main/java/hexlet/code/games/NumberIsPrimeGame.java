package hexlet.code.games;

import java.util.Random;

public class NumberIsPrimeGame {

    private static String correctAnswer;

    public static String getDescription() {

        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public static String getQuestion() {

        Random random = new Random();
        int x = 1 + random.nextInt(10);

        correctAnswer = checkSimple(x);

        return String.valueOf(x);

    }

    public static String getCorrectAnswer() {

        return correctAnswer;
    }

    private static String checkSimple(int i) {

        if ( i <= 1) {
            return "no";
        }
        if(i > 2 && i % 2 == 0) {
            return "no";
        }

        int n = 3;
        while (n * n <= i) {

            if (i % n == 0 || i % (n + 2) == 0) {
                return "no";
            }
            n = n + 6;
        }
        return "yes";
    }

}
