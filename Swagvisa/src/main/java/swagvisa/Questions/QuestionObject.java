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
public class QuestionObject {
    
    String right;
    String wrong1;
    String wrong2;
    
    public QuestionObject(String right) {
        this.right = right;
        this.wrong1 = "Does not compute";
        this.wrong2 = "Woot woot?";
    }
    
        public QuestionObject(String right, String wrong1, String wrong2) {
        this.right = right;
        this.wrong1 = wrong1;
        this.wrong2 = wrong2;
    }
    
    public void setWrong1(String answer) {
        this.wrong1 = answer;
    }
    
    public void setWrong2(String answer) {
        this.wrong2 = answer;
    }
    
}
