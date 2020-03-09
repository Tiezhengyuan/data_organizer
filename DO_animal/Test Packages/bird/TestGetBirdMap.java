/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bird;
import animal.*;
import animalSet.myMap;
import java.util.Map;
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
public class TestGetBirdMap {
    
    public TestGetBirdMap() {
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
        Map<String, String> hash;
        myMap h;
        //
        bird b = new bird("rr","bird", "2018-09-09");
        hash = b.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        eagle e = new eagle("d1","eagle", "2012-09-09");
        hash = e.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        hawk c = new hawk("d2","hawk", "2017-12-11");
        hash = c.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
    }
}
