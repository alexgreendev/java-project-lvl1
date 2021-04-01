package hexlet.code.games;

import java.util.Random;

public class EvenGame {
    private static String correctAnswer;

    public static String getDescription() {

        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public static String getQuestion() {

        Random random = new Random();
        int x = 1 + random.nextInt(25);

        if(x % 2 == 0) {
            correctAnswer = "yes";
        }
        if(x % 2 != 0) {
            correctAnswer = "no";
        }

        return String.valueOf(x);
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

}
