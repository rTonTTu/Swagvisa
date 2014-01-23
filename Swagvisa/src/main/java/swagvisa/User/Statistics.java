/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.User;

/**
 *
 * @author TonTTu
 */
public class Statistics {

    private int score;
    private int rightAnswers;
    private int wrongAnswers;

    public Statistics() {
        this.score = 0;
        this.rightAnswers = 0;
        this.wrongAnswers = 0;
    }

    public void setPoints(int points) {
        this.score = points;
    }

    public int getScore() {
        return this.score;
    }

    public int getRightAnswers() {
        return this.rightAnswers;
    }

    public int getWrongAnswers() {
        return this.wrongAnswers;
    }

}
