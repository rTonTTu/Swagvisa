/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Logic;

import java.util.Scanner;
import swagvisa.Questions.Question;
import swagvisa.User.Player;

/**
 *
 * @author TonTTu
 */
public class main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int questionNmbr = 1;
        Player player = new Player("Pentti Testipelaaja");

        Question kyssari = new Question("YOLO", "You only live once");

        System.out.println("Question number " + questionNmbr);
        System.out.println("What does " + kyssari.getAbbreviation() + " mean?");
        String answer = scanner.nextLine();
        if (answer.contains(kyssari.getDefinition())) {
            System.out.println("Right! you get a point!");
            player.answeredCorrectly();
            System.out.println("Thanks for playing");
        } else {
            System.out.println("You answered wrong :(");
            player.answeredIncorrectly();
        }
        System.out.println("You have " + player.getScore() + " points after answering " + player.getRightAnswers() + " times right");
        System.out.println("You have answered incorrectly " + player.getWrongAnswers() + " times.");

    }
}
