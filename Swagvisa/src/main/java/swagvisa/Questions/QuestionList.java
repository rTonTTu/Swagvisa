/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

import java.util.ArrayList;

/**
 *
 * @author TonTTu
 */
public class QuestionList {

    private ArrayList<QuestionObject> questionsList;

    public QuestionList() {
        this.questionsList = new ArrayList<QuestionObject>();
    }

    public void addQuestion(String answer) {
        this.questionsList.add(new QuestionObject(answer));
    }

    public void addQuestion(String answer, String wrong1, String wrong2) {
        this.questionsList.add(new QuestionObject(answer, wrong1, wrong2));
    }

}
