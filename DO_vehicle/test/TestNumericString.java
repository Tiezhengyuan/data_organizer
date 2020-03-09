/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TestNumericString {
    
    public TestNumericString() {
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
    public void hello(){
        boolean tag;
        String[] str={"123","0123", "012d3","ab","12/3213+", " ", ""};
        for(int i=0; i<str.length; i++){
            tag=str[i].matches("[+-]?\\d*(\\.\\d+)?");
            int result = -1;
            if(tag==true){
                result = Integer.parseInt(str[i]);
            }
            System.out.printf("[%s]\t%d\t%s\n", str[i], result, tag);
        }
        
    }
}
