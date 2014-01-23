/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swagvisa.UserTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import swagvisa.User.Player;

/**
 *
 * @author TonTTu
 */
public class PlayerTest {
    
    private Player user;
    
    public PlayerTest() {
    this.user = new Player("Tonttu", "esat");
    
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
    public void testForCorrecetName() {
        Player contestant = new Player("Esa");
        String name = "Esa";
        assertEquals(name, contestant.getName());
    }
    
    @Test
    public void testForCorrectTeam1() {
        Player contestant = new Player("Esa");
        String team = "Esa";
        assertEquals(team, contestant.getTeam());
    }
    
    @Test
    public void testForCorrectTeam2() {
        Player contestant = new Player("Esa", "Karvaturrit");
        String team = "Karvaturrit";
        assertEquals(team, contestant.getTeam());
    }
    
    @Test
    public void testForCorrectAnswers() {
        this.user.answeredCorrectly();
        int rightAnswers = this.user.getRightAnswers();
        assertEquals(rightAnswers, 1);
    }
    
    @Test
    public void testForCorrectScore() {
        this.user.answeredCorrectly();
        int score = this.user.getScore();
        assertEquals(score, 1);
    }
    
    @Test
    public void testForIncorrectAnswers() {
        this.user.answeredIncorrectly();
        int incorrectAnswers = this.user.getWrongAnswers();
        assertEquals(incorrectAnswers, 1);
    }
    
    @Test
    public void testManipulatingTheScoreManualle() {
        this.user.answeredCorrectly();
        this.user.setPoints(5);
        int score = this.user.getScore();
        assertEquals(score, 5);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
