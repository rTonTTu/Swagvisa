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
import swagvisa.User.Statistics;

/**
 *
 * @author TonTTu
 */
public class StatisticsTest {

    private Statistics stats;

    public StatisticsTest() {
        this.stats = new Statistics();
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
    public void testScoreSetter() {
        this.stats.setPoints(5);
        assertEquals(this.stats.getScore(), 5);
    }

    @Test
    public void testStatsAfterFewRounds1() {
        this.stats.answeredCorrectly();
        this.stats.answeredCorrectly();
        this.stats.answeredIncorrectly();

        assertEquals(this.stats.getRightAnswers(), 2);
    }

    @Test
    public void testStatsAfterFewRounds2() {
        this.stats.answeredCorrectly();
        this.stats.answeredCorrectly();
        this.stats.answeredIncorrectly();

        assertEquals(this.stats.getWrongAnswers(), 1);
    }

    @Test
    public void testStatsAfterFewRounds3() {
        this.stats.answeredCorrectly();
        this.stats.answeredCorrectly();
        this.stats.answeredIncorrectly();

        assertEquals(this.stats.getScore(), 2);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
