/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author TonTTu
 */
public class QuestionObject {

    private Random randomGenerator;
    private String capital;
    private String wrong1;
    private String wrong2;
    private String country;
    private ArrayList<String> wrongAnswersList;

    public QuestionObject(String right) {
        this.capital = right;
        this.wrong1 = "Does not compute";
        this.wrong2 = "Woot woot?";

    }

    public QuestionObject(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public void setWrong1(String answer) {
        this.wrong1 = answer;
    }

    public void setWrong2(String answer) {
        this.wrong2 = answer;
    }

    public void randomizeWrongAnswers() {
        Collections.addAll(this.wrongAnswersList, "Helsink", "Stockholm", "Oslo", "Djibouti", "Tallinn", "Moscow", "Berlin", "Vienna", "Warsaw", "Reykjavik",
                "Paris", "Madrid", "Buenos aires", "Minsk", "Sofia", "Ottawa", "Beijing", "Zagreb", "Copenhagen", "Athens", "New Delhi", "Baghdad", "Jerusalem", 
                "Kingston", "Tokyo", "Riga", "Skopje", "Bratislava");
 
        while (true) {
            int index = randomGenerator.nextInt(this.wrongAnswersList.size());
            if (!this.wrongAnswersList.get(index).equals(this.capital)) {
                this.wrong1 = this.wrongAnswersList.get(index);
                break;
            }
        }
        while (true) {
            int index = randomGenerator.nextInt(this.wrongAnswersList.size());
            if (!this.wrongAnswersList.get(index).equals(this.capital) && !this.wrongAnswersList.get(index).equals(this.wrong1)) {
                this.wrong2 = this.wrongAnswersList.get(index);
                break;
            }
        }
    }
}
