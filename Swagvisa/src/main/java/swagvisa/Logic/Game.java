/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Logic;

import java.util.Random;
import swagvisa.Questions.QuestionList;
import swagvisa.User.Player;

/**
 *
 * @author TonTTu
 */
public class Game {

    private int maxQuestions;
    private Player player;
    private String rightAnswer;
    private String answer;

    public Game() {
        this.maxQuestions = 10;
        this.player = new Player("Pelaaja 1");

    }

    public void Ask() {
        Random random = new Random();
        int randomNumber = random.nextInt(3)+1;
        QuestionList questions = new QuestionList();        
        
        this.rightAnswer = questions.getQuestion1().getAbbreviation();
        
        
        
        if (this.answer.equals(this.rightAnswer)) {
            this.player.answeredCorrectly();

        } else {
            this.player.answeredIncorrectly();
        }

    }
}
