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
public class createVehicleOfInterest {
    
    public createVehicleOfInterest() {
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
        s.createVehicleOfInterest("CG6789", "Silver Alert", "Honda",
            "Civic", "2009", "white", "Johne Cary", "1234519999");
        
        //retrieve 
        String[][] data;
        data = s.allVehicleOfInterest();
        //
        for(int x=0; x < data.length; x++){
            for(int y=0; y < data[x].length; y++){
                System.out.printf("%s\t", data[x][y]);
            }
            System.out.println();
        }
    }
    
}
