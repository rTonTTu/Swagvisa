/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import swagvisa.Questions.Question;

/**
 *
 * @author thomasto@cs
 */
public class QuestionList {

    private Map<Integer, Question> questions;
    private int questionOne;
    private int questionTwo;
    private int questionThree;

    public QuestionList() {
        this.questions = new HashMap<>();
        addQuestions();
    }

    public void addQuestions() {
        this.questions.put(1, new Question("Swag", "Fashionable appearance which sways people"));
        this.questions.put(2, new Question("Jäbä", "A multipurpose word like 'dude'"));
        this.questions.put(3, new Question("Jäbätär", "A multipurpose word like 'dude' except for women"));
        this.questions.put(4, new Question("Bling", "A way to describe jewellery and other expensive objects"));
        this.questions.put(5, new Question("Kakkavisa", "A formal greeting in the TKO-äly crowd"));
        this.questions.put(6, new Question("YOLO", "A sort of suicidal call"));
        this.questions.put(7, new Question("BMUR", "A powerful shout to advice your friends that URHO-bear needs some assistance with his liqour"));
        this.questions.put(8, new Question("Jatsss", "Cry for help after doing something that disappoints you"));
        this.questions.put(9, new Question("EKK", "'Intille on vaihtoehtoja'"));
        this.questions.put(10, new Question("Kari", "Nipanipanipa"));
        this.questions.put(11, new Question("Aitoa_menoa", "The truth."));
        this.questions.put(12, new Question("Mötö", "Not again /__\'"));
        this.questions.put(13, new Question("Simobot", "Needs a boot"));
    }

    public void QuestionRandomizer() {
        Random rand = new Random();
        this.questionOne = rand.nextInt(this.questions.size()+1);
        while (true) {
            int randomNumber = rand.nextInt(this.questions.size()+1);
            if (randomNumber != this.questionOne) {
                this.questionTwo = randomNumber;
                break;
            }
        }
        
        while (true) {
            int randomNumber = rand.nextInt(this.questions.size()+1);
            if (randomNumber != this.questionOne || randomNumber != this.questionTwo) {
                this.questionThree = randomNumber;
                break;
            }
        }

    }

}
