/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Logic;

import java.util.Scanner;
import swagvisa.Questions.*;

/**
 *
 * @author TonTTu
 */
public class main {

    public static void main(String args[]) {

        QuestionList question = new QuestionList();
        
        Scanner scanner = new Scanner(System.in);
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
