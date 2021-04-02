package hexlet.code.games;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ProgressionGame {

    private static String correctAnswer;
    public static Random random = new Random();
    public static String getDescription() {
        return "What number is missing in the progression?";
    }

    public static String getQuestion() {
        int maxSize = 10;
        int minRandomIndex = 3;

        ArrayList<String> progression = new ArrayList<String>( );

        int step = 1 + random.nextInt(10);
        int progressionItem = 1 + random.nextInt(25);


        while (progression.size() != maxSize) {
            progression.add(Integer.toString(progressionItem));
            progressionItem += step;
        }

        int randomIndex = minRandomIndex + random.nextInt(maxSize - minRandomIndex);
        correctAnswer = String.valueOf(Integer.parseInt(progression.get(randomIndex)));
        progression.set(randomIndex, "..");

        return progression.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", " ");
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

}
