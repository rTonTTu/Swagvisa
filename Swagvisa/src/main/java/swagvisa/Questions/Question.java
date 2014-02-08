/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.Questions;

/**
 *
 * @author TonTTu
 */
public class Question {

    private String abbreviation;
    private String definition;

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
}

