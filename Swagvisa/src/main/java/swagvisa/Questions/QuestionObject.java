/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author TonTTu
 */
public class QuestionObject {

    private Random randomGenerator;
    private String right;
    private String wrong1;
    private String wrong2;
    private String question;
    private ArrayList<String> wrongAnswersList;

    public QuestionObject(String right) {
        this.right = right;
        this.wrong1 = "Does not compute";
        this.wrong2 = "Woot woot?";

    }

    public QuestionObject(String question, String right) {
        this.question = question;
        this.right = right;
    }

    public void setWrong1(String answer) {
        this.wrong1 = answer;
    }

    public void setWrong2(String answer) {
        this.wrong2 = answer;
    }

    public void randomizeWrongAnswers() {
        this.wrongAnswersList.add("Stockholm");
        this.wrongAnswersList.add("Copenhagen");
        this.wrongAnswersList.add("Turku");
        this.wrongAnswersList.add("Tampere");
        this.wrongAnswersList.add("Oslo");
        this.wrongAnswersList.add("Ougabougagagoubou");
        this.wrongAnswersList.add("Tokyo");
        this.wrongAnswersList.add("Moscow");
        this.wrongAnswersList.add("Barcelona");
        this.wrongAnswersList.add("Sofia");
        this.wrongAnswersList.add("Skopje");
        this.wrongAnswersList.add("Reykjavik");
        this.wrongAnswersList.add("Tallinn");
        this.wrongAnswersList.add("Berlin");
        this.wrongAnswersList.add("Frankfurt");
        this.wrongAnswersList.add("London");
        this.wrongAnswersList.add("Munich");
        this.wrongAnswersList.add("Düsseldorf");
        this.wrongAnswersList.add("Paris");
        this.wrongAnswersList.add("New York");
        this.wrongAnswersList.add("Washington");
        this.wrongAnswersList.add("Seattle");
        this.wrongAnswersList.add("Denver");
        this.wrongAnswersList.add("New Delhi");
        this.wrongAnswersList.add("Canberra");
        this.wrongAnswersList.add("Melbourne");
        this.wrongAnswersList.add("Dallas");
        this.wrongAnswersList.add("Bern");
        this.wrongAnswersList.add("Ankara");
        this.wrongAnswersList.add("Budapest");
        this.wrongAnswersList.add("Cairo");
        this.wrongAnswersList.add("Dublin");
        this.wrongAnswersList.add("Islamabad");
        this.wrongAnswersList.add("Jerusalem");
        this.wrongAnswersList.add("Luxembourg");
        this.wrongAnswersList.add("Madrid");
        this.wrongAnswersList.add("Minsk");
        this.wrongAnswersList.add("Taipei");
        this.wrongAnswersList.add("Vienna");
        this.wrongAnswersList.add("Warsaw");

        while (true) {
            int index = randomGenerator.nextInt(this.wrongAnswersList.size());
            if (!this.wrongAnswersList.get(index).equals(this.right)) {
                this.wrong1 = this.wrongAnswersList.get(index);
                break;
            }
        }
        while (true) {
            int index = randomGenerator.nextInt(this.wrongAnswersList.size());
            if (!this.wrongAnswersList.get(index).equals(this.right) && !this.wrongAnswersList.get(index).equals(this.wrong1)) {
                this.wrong2 = this.wrongAnswersList.get(index);
                break;
            }
        }
    }
}
