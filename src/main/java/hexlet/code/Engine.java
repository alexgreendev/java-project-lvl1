package hexlet.code;

import java.util.Scanner;

public abstract class Engine {
    public abstract String getDescription();
    public abstract String getQuestion();
    public abstract String getCorrectAnswer();

    public void runGame(String name) {
        System.out.println(this.getDescription());

        for(int count = 1; count < 4; count++) {
            Scanner console = new Scanner(System.in);
            System.out.println("Question: " + this.getQuestion());

            String answer = console.nextLine();
            System.out.println("Your answer: " + answer);

            if (!answer.equals(this.getCorrectAnswer())) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + this.getCorrectAnswer() + "." +
                        " Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}





