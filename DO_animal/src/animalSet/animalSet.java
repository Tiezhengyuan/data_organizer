package animalSet;

import animal.*;
import myUtil.*;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;




public class animalSet {
    //public static String animalSetName;
    //public static String animalSetFile;
    //public static String setsFile;
    public static ArrayList<String> list;
    public static Map<String, Map<String,String>> hash;

    //constructor
    public animalSet() {
        //initiate animal;
        list = new ArrayList<>();
        hash = new HashMap();
    }

    /**
     *
     * @param name
     * @param specie
     * @param birthDateStr
     * @return
     */
    public static Map addAnimal(String name, String specie, String birthDateStr ) throws InvalidAnimalException {

      switch (specie) {
          case "goat":
              goat g = new goat(name,specie,birthDateStr); 
              hash.put(name, g.getAnimalMap());break;
          case "lion":
              lion l = new lion(name,specie,birthDateStr); 
              hash.put(name, l.getAnimalMap());break;
          case "pig":
              pig p = new pig(name,specie,birthDateStr);
              hash.put(name, p.getAnimalMap()); break;
          case "turtle":
              turtle t = new turtle(name,specie,birthDateStr);
              hash.put(name, t.getAnimalMap()); break;
          case "iguana":
              iguana i = new iguana(name,specie,birthDateStr);
              hash.put(name, i.getAnimalMap()); break;
          case "eagle":
              eagle e = new eagle(name,specie,birthDateStr);
              hash.put(name, e.getAnimalMap()); break;
          case "hawk":
              hawk h = new hawk(name,specie,birthDateStr);
              hash.put(name, h.getAnimalMap()); break;
          default:
              System.out.println("Error.Wrong animal specie!");
              break;
      }
    return hash;
  }


    public static void printList() {
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i));  
        }
}

    public static void printAnimalHash() {
        String output = "%10s%10s%10s%15s%5s%20s\n";
        System.out.printf(output, "Name","Specie", "Type", "Birth Date", "Age", "Life expectancy");
        for (Map.Entry me : hash.entrySet()) {
            Map<String, String> m=(Map<String, String>) me.getValue();
            //System.out.println("Key: "+me.getKey() + " & Value: " + m);
            System.out.printf(output, m.get("name"), m.get("specie"), m.get("type"), 
              m.get("birthDate"), m.get("age"), m.get("lifeExpectancy") );
        }
    }

    public static String getAnimalBlock() {
        String animalBlock = "Name,"+"Specie,"+ "Type,"+ "Birth Date,"+ "Age,"+ "Life expectancy\n";
        for (Map.Entry me : hash.entrySet()) {
            Map<String, String> m=(Map<String, String>) me.getValue();
            animalBlock += m.get("name")+ ","+m.get("specie")+ ","+m.get("type")+","+
              m.get("birthDate")+ ","+m.get("age")+ ","+m.get("lifeExpectancy")+"\n";
        }
        return animalBlock;
    }
    /**
     *
     * @return 
     * retrieve names of animal sets 
     */
    public String[] getSetNames(){
        File dir = new File("animalSets");
        String[] files = dir.list();
        if (files.length == 0) {
            System.out.println("The directory is empty.");
        }
        return files;
    }
    /**
     *same getSetNames but different return type
     * @return 
     * retrieve names of animal sets 
     */
    public ArrayList getSetNamesList(){
        String[] files = this.getSetNames();
        //convert list to arraylist
        list.clear();//clear list
        boolean addAll = list.addAll(Arrays.asList(files));
        return list;
    }    
    
    //update animal name
    public static Map updateAnimalName(String oldName, String newName) {
  if ( hash.containsKey(oldName) ){
    Map animalMap = hash.remove(oldName);
    //change value of name
    animalMap.put("name", newName);
    //update
    hash.put(newName, animalMap);
    //printAnimalHash();
  }else{
      System.out.println("Error! Wrong animal name! No animal name is updated.");
  }
  return hash;
}

    //update animal specie name
    public static Map updateAnimalSpecie(String animalName, String newSpecie) {
  if (hash.containsKey(animalName)){
    Map animalMap = hash.remove(animalName);
    //change value of name
    animalMap.put("specie", newSpecie);
    //update
    hash.put(animalName, animalMap);
  }else{
      System.out.println("Error! Wrong animal name! No animal name is updated.");
  }
  return hash;
}

    // update animal birth date, and then age and life expectancy are updated, too.
    public static Map updateAnimalBirthDate(String animalName, String birthDateStr) throws InvalidAnimalException{
    if (hash.containsKey(animalName)){
    Map animalMap = hash.remove(animalName);
    //retrieve name, specie, and bithdate
    String inName = animalMap.get("name").toString();
    String inSpecie = animalMap.get("specie").toString();
    // add animal
    addAnimal(inName, inSpecie, birthDateStr);
  }else{
      System.out.println("Error! Wrong animal name! No animal name is updated.");
  }
  return hash;    
}

    //delete animal data
    public static Map deleteAnimal(String animalName) {
  if ( hash.containsKey(animalName) ){
    hash.remove(animalName);
    System.out.println("Warning! The animal "+animalName+" is deleted.");
  }else{
    System.out.println("Error! Wrong animal name! No animal name is updated.");
  }
  return hash;
}

    public boolean deleteAnimalSet(String animalSetName){
        //get list
        this.getSetNamesList();
        if(list.contains(animalSetName)){
            //delete set file
            File f = new File("animalSets\\" + animalSetName);
            f.delete();
            System.out.println("Warning! "+animalSetName+" was deleted.");
            //update list
            this.getSetNamesList();
            System.out.println(list);
            return true;
        }else{
            System.out.println("Error! "+animalSetName+" doesn't exist. No deletion.");
            return false;
        }
    }//
    
    //
    public void toTrackFile(String outfile) throws FileNotFoundException{
      //
        File file;
        PrintWriter output = null;
        //
        file = new File(outfile); //file handle
        if (file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }
        //
        try{
            output = new PrintWriter(file); // create a file
            //
            String outputFormat = "%s,%s,%s,%s,%s,%s\n";
            output.printf(outputFormat, "Name","Specie", "Type", "Birth Date", "Age", "Life expectancy");
            for (Map.Entry me : hash.entrySet()) {
                Map<String, String> m = (Map<String, String>) me.getValue();
                output.printf(outputFormat, m.get("name"), m.get("specie"), m.get("type"), 
                        m.get("birthDate"), m.get("age"), m.get("lifeExpectancy") );
            }
        }catch(FileNotFoundException e){
            // TODO Auto-generated catch block
            System.out.println("Error! File writing failed.");
        }finally{
            if(output!=null){
                output.close();
            }
        }
     //
    }

    public void toFile(String outfile) throws FileNotFoundException{
      //
        File file;
        PrintWriter output = null;
        //
        file = new File(outfile); //file handle
        if (file.exists()){
            System.out.println("File already exists.");
            System.exit(1);
        }
        //
        try{
            output = new PrintWriter(file); // create a file
            //
            for (Map.Entry me : hash.entrySet()) {
                Map<String, String> m = (Map<String, String>) me.getValue();
                output.printf("%s,%s,%s\n", m.get("name"), m.get("specie"), m.get("birthDate") );
            }
        }catch(FileNotFoundException e){
            // TODO Auto-generated catch block
            System.out.println("Error! File writing failed.");
        }finally{
            if(output!=null){
                output.close();
            }
        }
    //
    }

    public void fromFile(String infile) throws FileNotFoundException, InvalidAnimalException {
    //
    File file;
    Scanner input = null;
    //
    file = new File(infile); //file handle
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
            String [] items = line.split(",");
            //
            this.addAnimal(items[0],items[1],items[2]);
        }
    }catch(FileNotFoundException e){
        System.out.println("Error! File reading failed.");
    }finally{
        if(input!=null){
            input.close();
        }
    }
    //return hash;
  }

    //TextBlock:name,specie,birthDate\nname,specie,birthDate\n......
    public void fromTextBlock(String textBlock) throws InvalidAnimalException{
        String[] animals, animal;
        //
        animals = textBlock.split("\n");
        for(String animalStr: animals){
            animal = animalStr.split(",");
            //add animal into hash
            System.out.println(animal[0]+ animal[1]+ animal[2]);
            this.addAnimal(animal[0].toString(), animal[1].toString(), animal[2].toString());
        }
        
    }//
    //confirm save an animal set
    public boolean saveAnimalSet(String setName) throws FileNotFoundException{//
        if(hash.isEmpty()){
            return false;
        }else{
            toFile("animalSets\\" + setName);
            return true;
        }
    }//   
    


    //add new methods
}//end