/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalSet;
import animalSet.myMap;
import java.util.*;

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
public class TestPrintMap {
    
    public TestPrintMap() {
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
    public void test(){
        Map<String, String> hash = new HashMap();
        hash.put("name", "d1");
        hash.put("birthDate", "2018-08-01");
        hash.put("age", Integer.toString(10));
        hash.put("lifeExpectancy", String.valueOf(10.3));
        //
        myMap c = new myMap(hash);
        c.printMap();
        
    }
    
}
