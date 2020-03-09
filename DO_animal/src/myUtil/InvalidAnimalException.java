/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myUtil;

/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class InvalidAnimalException extends Exception{
    private String animalName;
    
    //construct an exception
    public InvalidAnimalException(String name){
        super("Invalid animal name " + name); // invoke getMessage()
        animalName=name;
    }
    
    //retuan animal name
    public String getName(){
        return animalName;
    }
    
}//end
