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
 * Pelilogiikka jonka pohjalta peliä oikeasti pelataan. Luokasta löytyvällä
 * ask() metodilla kysytään pelaajalta kysymyksiä, jotka on määritelty
 * konstrutktorin kautta.
 *
 * @author TonTTu
 */
public class Game {
    private int maxQuestions;
    private Player player;
    private String rightAnswer;
    private String answer;

    /*
     Konstruktori pelillogiikalle, jossa määritellään pelaajan tiedot sekä 
     kysymysten määrä, jotka tullaan pelissä kysymään.
     */
    public Game() {
        this.maxQuestions = 10;
        this.player = new Player("Pelaaja 1");
    }

    /**
     * Metodissa kysytään pelaajalta kysymys ja riippuen vastauksesta annetaan
     * pelaajalle joko yksi piste oikeasta vastauksesta tai ei yhtään pistettä
     * väärästä vastauksesta. Tämän jälkeen tulokset päivitetään pelaajan
     * tilastoihin.
     * @return tehty kysymyslista
     */
    
    public QuestionList ask() {
        QuestionList questions = new QuestionList();
        this.rightAnswer = questions.getQuestion1().getAbbreviation();
        return questions;
    }
    
    public boolean answer(String answer) {
        return this.rightAnswer.equals(answer);
    }
}
