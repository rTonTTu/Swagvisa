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
    private int index;

    public QuestionObject(String country, String capital) {
        this.country = country;
        this.capital = capital;
        this.wrongAnswersList = new ArrayList<>();
        randomizeWrongAnswers();
    }

    public String getCapital() {
        return this.capital;
    }

    public String getCountry() {
        return this.country;
    }

    public String getWrong1() {
        return this.wrong1;
    }

    public String getWrong2() {
        return this.wrong2;
    }

    public void setWrong1(String answer) {
        this.wrong1 = answer;
    }

    public void setWrong2(String answer) {
        this.wrong2 = answer;
    }

    public int randomNumber() {
        double x = Math.random() * this.wrongAnswersList.size();
        this.index = (int) x;
        return this.index;
    }

    public void randomizeWrongAnswers() {
        Collections.addAll(this.wrongAnswersList, "Helsinki", "Stockholm", "Oslo", "Djibouti", "Tallinn", "Moscow", "Berlin", "Vienna", "Warsaw", "Reykjavik",
                "Paris", "Madrid", "Buenos aires", "Minsk", "Sofia", "Ottawa", "Beijing", "Zagreb", "Copenhagen", "Athens", "New Delhi", "Baghdad", "Jerusalem",
                "Kingston", "Tokyo", "Riga", "Skopje", "Bratislava");

        while (true) {
            randomNumber();
            if (!this.wrongAnswersList.get(index).equals(this.capital)) {
                this.wrong1 = this.wrongAnswersList.get(index);
                break;
            }
            randomNumber();
            this.index = randomGenerator.nextInt(this.wrongAnswersList.size());
            if (!this.wrongAnswersList.get(index).equals(this.capital) && !this.wrongAnswersList.get(index).equals(this.wrong1)) {
                this.wrong2 = this.wrongAnswersList.get(index);
                break;
            }
        }
    }
}
