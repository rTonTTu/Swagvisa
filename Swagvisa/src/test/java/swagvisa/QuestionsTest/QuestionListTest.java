/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swagvisa.QuestionsTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swagvisa.Questions.Question;
import swagvisa.Questions.QuestionList;

/**
 *
 * @author thomasto@cs
 */
public class QuestionListTest {

    private QuestionList questionList;

    public QuestionListTest() {
        this.questionList = new QuestionList();
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void MakeSureTheQuestionListIsNotNull() {
        assertNotNull(questionList);
    }

    @Test
    public void MakeSureTheRandomizerWorksAndDoesntLeaveNulls() {
        questionList.QuestionRandomizer();
        int comparable = questionList.getRandomNumberOne();
        int comparableTwo = questionList.getRandomNumberTwo();
        int comparableThree = questionList.getRandomNumberThree();
        assertNotNull(comparable);
        assertNotNull(comparableTwo);
        assertNotNull(comparableThree);
    }
    
    @Test
    public void MakeSureTheQuestionsArentNull() {
        Question comparableOne = questionList.getQuestion1();
        Question comparableTwo = questionList.getQuestion2();
        Question comparableThree = questionList.getQuestion3();
        assertNotNull(comparableOne);
        assertNotNull(comparableTwo);
        assertNotNull(comparableThree);        
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
