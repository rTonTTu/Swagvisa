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
        question.addQuestion("What is the capital of your country?", "Helsinki", "Turku", "Tampere");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println();
        
        String answer = scanner.nextLine();

        if (answer.equals(rightAnswer)) {
            System.out.println("righto!");

        } else {
            System.out.println("Wrong-oh-ouh");
        }

    }
}
