package hexlet.code.games;

import java.util.ArrayList;
import java.util.Random;

public class CalcGame {

    private static String correctAnswer;
    private static final int NUM_RANDOM = 10;
    private static final int NUM_OPERATOR = 2;
    private static final ArrayList<String> OPERATORS = new ArrayList<String>() {
        {
        add("*");
        add("+");
        add("-");
        }
    };

    public static String getDescription() {

        return "What is the result of the expression?";
    }

    public static String getQuestion() throws Exception {

        Random random = new Random();
        int first = 1 + random.nextInt(NUM_RANDOM);
        int second = 1 + random.nextInt(NUM_RANDOM);
        int randomIndex = random.nextInt(NUM_OPERATOR);

        String operator = (String) OPERATORS.get(randomIndex);

        switch (operator) {
            case "+":
                correctAnswer = Integer.toString(first + second);
                break;
            case "-":
                correctAnswer = Integer.toString(first - second);
                break;
            case "*":
                correctAnswer = Integer.toString(first * second);
                break;
            default:
                throw new Exception("Error");
        }
        return first + " " + operator + " " + second;
    }
    public static String getCorrectAnswer() {

        return correctAnswer;
    }
}
