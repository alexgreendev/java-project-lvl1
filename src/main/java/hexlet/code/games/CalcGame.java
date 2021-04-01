package hexlet.code.games;

import java.util.ArrayList;
import java.util.Random;
import hexlet.code.Engine;

public class CalcGame extends Engine {
    private String correctAnswer;
    private final ArrayList<String> operators = new ArrayList<String>(){{
        add("*");
        add("+");
        add("-");
    }};

    public String getDescription() {

        return "What is the result of the expression?";
    }

    public String getQuestion() {

        Random random = new Random();
        int first = 1 + random.nextInt(25);
        int second = 1 + random.nextInt(10);
        int randomIndex = random.nextInt(2);

        String operator = (String) this.operators.get(randomIndex);

        switch (operator) {
            case "+":
                this.correctAnswer = Integer.toString(first + second);
                break;
            case "-":
                this.correctAnswer = Integer.toString(first - second);
                break;
            case "*":
                this.correctAnswer = Integer.toString(first * second);
                break;
        }
        return first + " " + operator + " " + second;
    }
    public String getCorrectAnswer() {

        return this.correctAnswer;
    }
}
