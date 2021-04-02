package hexlet.code.games;

import java.util.ArrayList;
import java.util.Random;

public class ProgressionGame {

    private static String correctAnswer;
    private static Random random = new Random();
    private static final int MAX_SIZE = 10;
    private static final int MIN_INDEX_RANDOM = 3;
    private static final int MAX_SIZE_RANDOM = 10;
    private static final int MAX_RANDOM = 25;

    public static String getDescription() {

        return "What number is missing in the progression?";
    }

    public static String getQuestion() {

        ArrayList<String> progression = new ArrayList<String>();

        int step = 1 + random.nextInt(MAX_SIZE_RANDOM);
        int progressionItem = 1 + random.nextInt(MAX_RANDOM);

        while (progression.size() != MAX_SIZE) {
            progression.add(Integer.toString(progressionItem));
            progressionItem += step;
        }

        int randomIndex = MIN_INDEX_RANDOM + random.nextInt(
                MAX_SIZE - MIN_INDEX_RANDOM);
        correctAnswer = String.valueOf(
                Integer.parseInt(progression.get(randomIndex)));
        progression.set(randomIndex, "..");

        return progression.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }

    public static String getCorrectAnswer() {
        return correctAnswer;
    }

}
