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
public class deleteVehicleMake {
    
    public deleteVehicleMake() {
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
    {   //
        VehiclesOfInterestController s = new VehiclesOfInterestController();
        s.deleteVehicleMake("ds");
        //
        String[] data;
        data = s.allVehicleMake();
        //
        for(int x=0; x < data.length; x++){
            System.out.printf("%s\t", data[x]);
            System.out.println();
        }
    }
    
}
