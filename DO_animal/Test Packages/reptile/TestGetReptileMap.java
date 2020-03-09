/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reptile;
import bird.*;
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
public class TestGetReptileMap {
    
    public TestGetReptileMap() {
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
        reptile r = new reptile("rr","reptile", "2018-09-09");
        hash = r.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        turtle t = new turtle("d1","turtle", "2012-09-09");
        hash = t.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
        //
        iguana i = new iguana("d2","iguana", "2012-12-11");
        hash = i.getAnimalMap();
        h = new myMap(hash);
        h.printMap();
    }
}
