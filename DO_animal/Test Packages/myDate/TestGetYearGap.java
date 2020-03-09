/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myDate;

import myUtil.myDate;
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
public class TestGetYearGap {
    
    public TestGetYearGap() {
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
    public void testGetYearGap() {
        //previous date
        String StringYear="2018-05-01";
        int expected=1;
        int actual=myDate.GetYearGap(StringYear);
        assertEquals(expected, actual, 0.01);
        
        //current date
        StringYear="2019-05-01";
        expected=0;
        actual=myDate.GetYearGap(StringYear);
        assertEquals(expected, actual, 0.01);
        
        //future date
        StringYear="2029-05-01";
        expected=-10;
        actual=myDate.GetYearGap(StringYear);
        assertEquals(expected, actual, 0.01);
        
    }
}
