/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestionsTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swagvisa.Questions.Question;

/**
 *
 * @author TonTTu
 */
public class QuestionsTest {

    private Question testQuestion;

    public QuestionsTest() {
        this.testQuestion = new Question("Yolo", "You only live once");
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

    /**
     * Testataan konstruktorikutsun yhteydessä luodun kysymyksen lyhennelmän oikeellisuutta.
     */
    
    @Test
    public void TestForQuestionToHaveTheRightAbbreviationUponConstruction() {
        Question test = new Question("Yolo", "You only live once");
        String abbreviation = "Yolo";
        assertEquals(abbreviation, test.getAbbreviation());
    }
    /**
     * Testataan konstruktorikutsun yhteydessä luodun kysymyksen selityksen oikeellisuutta.
     */
    @Test
    public void TestForQuestionToHaveTheRightDefinitionUponConstruction() {
         Question test = new Question("Yolo", "You only live once");
        String definition = "You only live once";
        assertEquals(definition, test.getDefinition());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
