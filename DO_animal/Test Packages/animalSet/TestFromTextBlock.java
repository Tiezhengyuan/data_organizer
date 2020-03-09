/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalSet;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import myUtil.InvalidAnimalException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class TestFromTextBlock {
    
    public TestFromTextBlock() {
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
    public void test() throws FileNotFoundException, InvalidAnimalException{
        animalSet c = new animalSet();
        c.fromTextBlock("d7,hawk,2018-07-12,1,5.0" + "d4,turtle,2012-01-01,7,103.0\n" +
                "d5,iguana,2017-01-01,2,5.0\n" + "d6,eagle,2018-12-01,1,5.0\n");
        c.printAnimalHash();
        
    }
}
