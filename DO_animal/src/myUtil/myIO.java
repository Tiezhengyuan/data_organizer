/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myUtil;
//Map,HashMap, File, PrintWriter, FileNotFoundException
import java.io.*;
//ArrayList, Scanner
import java.util.*;

/**
 *
 * @author Yuan Tiezheng <tiezhengyuan@hotmail.com>
 */
public class myIO {//
    public static ArrayList<String> list;
    //public Static Map<String,String> strMap;
    
    //constructor
    public myIO(){
        list = new ArrayList<>();
    }
     

    /**
     *create an empty text file
     * @param outFile
     * @throws FileNotFoundException
     */
    public void createEmptyFile(String outFile) throws FileNotFoundException{
        //
        File file;
        PrintWriter output = null;
        //
        file = new File(outFile); //file handle
        if (file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }
        //
        try{
            output = new PrintWriter(file); // create a file
        }catch(FileNotFoundException e){
            // TODO Auto-generated catch block
            System.out.println("Error! File writing failed.");
        }finally{
            if(output!=null){
                output.close();
            }
        }
    }
    
    public ArrayList getListFromFile(String inFile) throws FileNotFoundException{
        //
        File file;
        Scanner input = null;
        //
        file = new File(inFile); //file handle
        if ( !file.exists()){
            System.out.println("File doesn't exist.");
            System.exit(1);
        }
        //
        try{
            input = new Scanner(file);
            while(input.hasNext()){
                String line=input.next();
                //System.out.println(line);
                list.add(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error! File reading failed.");
        }finally{
            if(input!=null){
                input.close();
            }
        }
        //System.out.println(list);
        return list;
    }
    
    
    //add new methods
}//
