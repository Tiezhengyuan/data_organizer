/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bird;
import animal.hawk;
import myUtil.InvalidAnimalException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class TestHawkLifeExpectancy {
    
    public TestHawkLifeExpectancy() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void test() throws InvalidAnimalException{
        hawk c = new hawk("dd","hawk","2015-09-09");
        //life expectancy=5;
        int expected = 5;
        float actual = c.calculateLifeExpectancy();
        assertEquals(expected, actual, 0.01);
    }
}
