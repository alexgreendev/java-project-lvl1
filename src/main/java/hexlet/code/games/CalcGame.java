package hexlet.code.games;

import java.util.ArrayList;
import java.util.Random;


public class CalcGame {
    private static String correctAnswer;
    private static final ArrayList<String> operators = new ArrayList<String>(){{
        add("*");
        add("+");
        add("-");
    }};

    public static String getDescription() {

        return "What is the result of the expression?";
    }

    public static String getQuestion() {

        Random random = new Random();
        int first = 1 + random.nextInt(25);
        int second = 1 + random.nextInt(10);
        int randomIndex = random.nextInt(2);

        String operator = (String) operators.get(randomIndex);

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
        }
        return first + " " + operator + " " + second;
    }
    public static String getCorrectAnswer() {

        return correctAnswer;
    }
}
