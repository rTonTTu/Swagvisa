/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import swagvisa.Questions.Question;

/**
 * Luokan tehtävänä listata kysymykset helpompaan muotoon, josta pelilogiikka
 * voi ensin ne satunnaisesti luoda ja sen jälkeen vertailla/manipuloida
 * halutessaan
 *
 * @author thomasto@cs
 */

public class QuestionList {

    private Map<Integer, Question> questions;
    private int randomNumberOne;
    private int randomNumberTwo;
    private int randomNumberThree;
    private Question questionOne;
    private Question questionTwo;
    private Question questionThree;
    private ArrayList<Question> readyQuestions;

    /**
     * Konstruktori jossa alustetaan hashmappi ja luodaan kysymykset listaan.
     */
    public QuestionList() {
        this.readyQuestions = new ArrayList<Question>();
        this.questions = new HashMap<>();
        this.questionOne = null;
        this.questionTwo = null;
        this.questionThree = null;
        addQuestions();
        QuestionRandomizer();;
        readyQuestions();
    }

    /**
     * Metodi joka lisää mappiin kysymykset peliä varten. Kysymykset valitaan
     * satunnaisesti listasta numeron perusteella, jonka jälkeen vertaillaan
     * lyhenteitä ja selityksiä
     */
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
        this.questions.put(14, new Question("cobu", "A sort of dive into annoying success featuring way too many blankets"));
        this.questions.put(15, new Question("Zyklon Pi", "The greatest tale of a fearless babushka"));
        this.questions.put(16, new Question("Gashunk", "The sound that a shark makes when it crashes through a door in a public toilet"));
        this.questions.put(17, new Question("hhhehehe", "A type of lizard"));
    }

    /**
     * Metodi luo listasta satunnaiset kysymykset pitäen huolen ettei kyseistä
     * kysymystä ole useampaan kertaan kyselyssä. Tämän jälkeen ne alustetaan
     * valmiiksi kysymyksiksi.
     */
    public void QuestionRandomizer() {
        Random rand = new Random();
        this.randomNumberOne = rand.nextInt(this.questions.size() + 1);
        while (true) {
            int randomNumber = rand.nextInt(this.questions.size() + 1);
            if (randomNumber != this.randomNumberOne) {
                this.randomNumberTwo = randomNumber;
                break;
            }
        }

        while (true) {
            int randomNumber = rand.nextInt(this.questions.size() + 1);
            if (randomNumber != this.randomNumberOne || randomNumber != this.randomNumberTwo) {
                this.randomNumberThree = randomNumber;
                break;
            }
        }
        this.questionOne = this.questions.get(this.randomNumberOne);
        this.questionTwo = this.questions.get(this.randomNumberTwo);
        this.questionThree = this.questions.get(this.randomNumberThree);
    }

    /*
    Metodi lisää kysymykset valmiiseen listaan, josta ne haetaan erikseen sitten itse ajotilanteessa. 
    Tämän yhteyteen on myös lisätty shuffle joka sekoittaa kysymysten paikan itse vastausnapeissa.
    */
    
    public void readyQuestions() {
        this.readyQuestions.add(questionOne);
        this.readyQuestions.add(questionTwo);
        this.readyQuestions.add(questionThree);
        Collections.shuffle(this.readyQuestions);
    }

    public Question getQuestion1() {
        return this.questionOne;
    }

    public Question getQuestion2() {
        return this.questionTwo;
    }

    public Question getQuestion3() {
        return this.questionThree;
    }

    public int getRandomNumberOne() {
        return randomNumberOne;
    }

    public int getRandomNumberTwo() {
        return randomNumberTwo;
    }

    public int getRandomNumberThree() {
        return randomNumberThree;
    }

    public ArrayList getQuestions() {
        return this.readyQuestions;
    }

}
