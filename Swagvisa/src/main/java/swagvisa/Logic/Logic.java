package swagvisa.Logic;

import java.util.Random;
import java.util.Scanner;
import swagvisa.Questions.QuestionObject;

/**
 *
 * @author TonTTu
 */
public class Logic {

    private Scanner scanner;
    private Random randomGenerator;

    public Logic() {
        this.scanner = new Scanner(System.in);
        String rightAnswer = "Helsinki";

        System.out.println("Lets try this out");
        System.out.println("What is the capital of your country?");
        String answer = scanner.nextLine();

        if (answer.equals(rightAnswer)) {
            System.out.println("righto!");
        } else {
            System.out.println("Wrong-oh-ouh");
        }

    }

    
     public void ask() {
        int index = randomGenerator.nextInt(this.questionsList.size());
        QuestionObject quiz = this.questionsList.get(index);
        System.out.println(quiz.question);
    }
}
