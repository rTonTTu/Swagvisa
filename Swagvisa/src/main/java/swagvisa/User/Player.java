/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.User;

/**
 * Luokka rakentaa pelaaja-olion jolla voidaan seurata tuloksia sekä tietoja
 * pelaajan toimista pelin sisällä.
 *
 * @author TonTTu
 */
public class Player {

    
    private Statistics stats;
    private final String name;
    private final String team;

    /**
     * Konstruktori jossa luodaan pelaajalle olio käyttäen parametrina annettua
     * Stringiä nimenä pelaajalle. Samassa luodaan pisteenlasku pelaajalle.
     *
     * @param name
     */
    public Player(String name) {
        this.name = name;
        this.team = name;
        this.stats = new Statistics();
    }

    /**
     * Konstruktori jossa luodaan pelaajalle olio käyttäen parametreinä
     * annettuja Stringejä pelaajan nimenä sekä joukkueen nimenä. . Samassa
     * luodaan pisteenlasku pelaajalle.
     *
     * @param name
     */
    public Player(String name, String team) {
        this.name = name;
        this.team = team;
        this.stats = new Statistics();

    }

    public void answeredCorrectly() {
        this.stats.answeredCorrectly();
    }

    public void answeredIncorrectly() {
        this.stats.answeredIncorrectly();
    }

    public void setPoints(int points) {
        this.stats.setPoints(points);
    }

    public int getScore() {
        return this.stats.getScore();
    }

    public int getRightAnswers() {
        return this.stats.getRightAnswers();
    }

    public int getWrongAnswers() {
        return this.stats.getWrongAnswers();
    }

    public String getName() {
        return this.name;
    }

    public String getTeam() {
        return this.team;
    }

    public String toString() {
        return this.name + ", " + this.team + ". Points: " + getScore() 
                +" Correct/Incorrect answers: " 
                + this.getRightAnswers() 
                + "/" + this.getWrongAnswers();
    }

}
