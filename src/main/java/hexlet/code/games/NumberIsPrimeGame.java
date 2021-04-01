package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class NumberIsPrimeGame extends Engine {

    private String correctAnswer;

    public String getDescription() {

        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getQuestion() {

        Random random = new Random();
        int x = 1 + random.nextInt(25);

        correctAnswer = checkSimple(x);

        return String.valueOf(x);

    }

    public String getCorrectAnswer() {

        return this.correctAnswer;
    }

    public static String checkSimple(int i) {
        if ( i <= 1)
            return "no";
        else if (i == 3)
            return "yes";
        else if (i % 2 == 0 || i % 3 == 0)
            return "no";
        int n = 5;
        while (n * n <= i){
            if (i % n == 0 || i % (n + 2) == 0)
                return "no";
            n = n + 6;
        }
        return "yes";
    }

}