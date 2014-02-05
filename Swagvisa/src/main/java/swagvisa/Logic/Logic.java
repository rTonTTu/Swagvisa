package swagvisa.Logic;

import java.util.Scanner;
import swagvisa.Questions.QuestionObject;

/**
 *
 * @author TonTTu
 */
public class Logic {

    private Scanner scanner;

    public Logic() {
        this.scanner = new Scanner(System.in);

        QuestionObject testi = new QuestionObject("Finland", "Helsinki");

        System.out.println("Lets try this out");
        System.out.println("What is the capital of" + testi.getCountry());
        System.out.println(testi.getCapital() + " " + testi.getWrong1() + " " + testi.getWrong2() + " " + testi.getCountry());
        String answer = scanner.nextLine();

        if (answer.equals(testi.getCapital())) {
            System.out.println("righto!");
        } else {
            System.out.println("Wrong-oh-ouh");
        }

    }

}
