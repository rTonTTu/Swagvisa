package swagvisa.Logic;

import java.util.Scanner;

/**
 *
 * @author TonTTu
 */
public class Logic {

    private Scanner scanner;

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

}
