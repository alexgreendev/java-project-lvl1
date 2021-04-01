package hexlet.code.games;

import hexlet.code.Engine;

import java.util.ArrayList;
import java.util.Random;

public class ProgressionGame extends Engine {

    private String correctAnswer;

    public String getDescription() {
        return "What number is missing in the progression?";
    }

    public String getQuestion() {
        int maxSize = 10;

        ArrayList<String> progression = new ArrayList<String>( );

        Random random = new Random();

        int step = 1 + random.nextInt(10);
        int progressionItem = 1 + random.nextInt(25);


        while (progression.size() != maxSize) {
            progression.add(Integer.toString(progressionItem));
            progressionItem += step;
        }

        int randomIndex = random.nextInt(maxSize);
        correctAnswer = String.valueOf(Integer.parseInt(progression.get(randomIndex)));
        progression.set(randomIndex, "..");

        return progression.toString();
    }


    public String getCorrectAnswer() {
        return this.correctAnswer;
    }

}
