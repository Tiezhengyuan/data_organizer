/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reptile;
import animal.turtle;
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
public class TestPrintTurtle {
    
    public TestPrintTurtle() {
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
        turtle a = new turtle("dd", "turtle", "2018-01-01");
        a.printAnimal();
    }
}
