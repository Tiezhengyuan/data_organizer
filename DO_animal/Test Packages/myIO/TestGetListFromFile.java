/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myIO;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import myUtil.myIO;

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
public class TestGetListFromFile {
    
    public TestGetListFromFile() {
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
    public void test() throws FileNotFoundException{
        myIO c = new myIO();
        //empty file
        ArrayList<String> list = c.getListFromFile("empty1.txt");
        System.out.println(list);
        //
        list = c.getListFromFile("animalSets\\animal_sets.txt");
        System.out.println(list);
        
    }
}
