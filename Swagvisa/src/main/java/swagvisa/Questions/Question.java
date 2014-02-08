/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

/**
 * Luokka kysymyksille, jotka ensin haetaan XML-tiedostosta jonka yhteydessä
 * oletettavasit lisätään listaan tai hashmappiin, WIP.
 *
 * @author TonTTu
 */
public class Question {

    private String abbreviation;
    private String definition;

    /**
     * Konstruktori joka pitää huolen kysymysten lyhenteiden sekä selitysten
     * eriyttämisestä.
     *
     * @param abbreviation Kysyttävä lyhenne
     * @param definition Kysyttävän lyhenteen selitys
     */
    public Question(String abbreviation, String definition) {
        this.abbreviation = abbreviation;
        this.definition = definition;
    }

    public String getDefinition() {
        return this.definition;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public String toString() {
        return getAbbreviation() + " - " + getDefinition();
    }
}
