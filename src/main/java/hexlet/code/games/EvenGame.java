package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class EvenGame extends Engine {
    private String correctAnswer;

    public String getDescription() {

        return "Answer 'yes' if number even otherwise answer 'no'.";
    }

    public String getQuestion() {

        Random random = new Random();
        int x = 1 + random.nextInt(25);

        if(x % 2 == 0) {
            this.correctAnswer = "yes";
        }
        if(x % 2 != 0) {
            this.correctAnswer = "no";
        }

        return String.valueOf(x);
    }

    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

}
