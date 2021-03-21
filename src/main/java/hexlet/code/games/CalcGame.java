package hexlet.code.games;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class CalcGame extends Engine{

    public void calculator(String name) {

        System.out.println("What is the result of the expression?");
        this.runGame(name);
    }
    @Override
    public void runGame(String name) {

        Integer result = 0;

        ArrayList<String> operator = new ArrayList<String>();
        operator.add(0, "*");
        operator.add(1, "+");
        operator.add(2, "-");


        for(int count = 1; count < 4; count++) {

            Random random = new Random();
            Scanner console = new Scanner(System.in);

            int first = 1 + random.nextInt(25);
            int second = 1 + random.nextInt(10);
            int randomIndex = random.nextInt(2);

            String str = (String) operator.get(randomIndex);

            System.out.println("Question: " + first + " " + str + " " + second);

            Integer answer = console.nextInt();
            System.out.println("Your answer: " + answer);

            if(str.equals("+")) { result = first + second; }
            if (str.equals("-")) { result = first - second; }
            else if(str.equals("*")) { result = first * second; }


            if (answer.equals(result)) {
                System.out.println("Correct!");

                if (count == 3) {
                    System.out.println("Congratulations, " + name + "!");
                    return;
                }

            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + "." +
                        " Let's try again, " + name + "!");
                return;
            }
        }
    }
}
