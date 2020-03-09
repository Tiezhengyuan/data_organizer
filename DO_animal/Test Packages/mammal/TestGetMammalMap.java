/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mammal;
import animal.*;
import animal.goat;
import animal.goat;
import animal.goat;
import animal.lion;
import animal.lion;
import animal.lion;
import animal.mammal;
import animal.pig;
import animal.pig;
import animal.pig;
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
public class TestGetMammalMap {
    
    public TestGetMammalMap() {
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
        mammal m = new mammal("mm","mammal", "2018-09-09");
        hash = m.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        lion l = new lion("d1","lion", "2012-09-09");
        hash = l.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
                //
        pig p = new pig("d2","pig", "2012-11-10");
        hash = p.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        goat g = new goat("d3","goat", "2010-12-11");
        hash = g.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
    }
}
