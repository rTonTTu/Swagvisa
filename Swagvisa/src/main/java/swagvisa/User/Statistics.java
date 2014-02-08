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
/**
 * Luokan tehtävänä on hallinnoida pelaajien pisteenlaskua antaen tarpeelliset
 * tilastot joiden avulla voidaan luoda yhtenäinen highscore-listaus
 *
 * @author TonTTu
 */
public class Statistics {

    private int score;
    private int rightAnswers;
    private int wrongAnswers;

    /**
     * Luo Statistics olion player oliolle, jonka avulla voidaan seurata
     * kyseisen pelaajan pistekehitystä.
     */
    public Statistics() {
        this.score = 0;
        this.rightAnswers = 0;
        this.wrongAnswers = 0;
    }

    /**
     *
     * @param points Mahdollistaa käsin aseteltavat pisteet mikäli tarve sen
     * vaatii.
     */
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

    /**
     * Pitää huolen pisteiden laskusta lisäämällä score arvoa sekä rightAnswers
     * arvoa.
     */
    public void answeredCorrectly() {
        this.score++;
        this.rightAnswers++;
    }

    /**
     * pitää huolen pisteiden laskusta lisäämällä arvoa wrongAnswersiin, jolloin
     * saadaan arvokasta tilastotietoa.
     */
    public void answeredIncorrectly() {
        this.wrongAnswers++;
    }
}
