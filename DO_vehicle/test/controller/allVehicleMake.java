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
//import static org.junit.Assert.*;


/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class allVehicleMake {
    
    public allVehicleMake() {
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
        //
        String[] vehicleMake;
        //
        VehiclesOfInterestController s = new VehiclesOfInterestController();
        vehicleMake = s.allVehicleMake();
        //
        System.out.println(vehicleMake[0]);
        System.out.println(vehicleMake.toString());
    }
}
