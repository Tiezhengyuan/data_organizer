package controller;

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

//
import java.util.ArrayList;

/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class createReasonsForInterest {
    
    public createReasonsForInterest() {
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
    public void test()
    {
        //insert reason interest into database
        VehiclesOfInterestController s = new VehiclesOfInterestController();
        s.createReasonOfInterest("Temp alert", "This is for test.");
        
        //retrieve 
        String[][] reasonInterest;
        reasonInterest = s.getAllReasonsForInterest();
        //
        for(int x=0; x < reasonInterest.length; x++){
            for(int y=0; y < reasonInterest[x].length; y++){
                System.out.printf("%s\t", reasonInterest[x][y]);
            }
            System.out.println();
        }
    }
    
}
