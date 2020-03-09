package animal;

import animal.animal;
import java.util.HashMap;
import java.util.Map;
import myUtil.InvalidAnimalException;


public class reptile extends animal {
  public static String type;
  public static Map<String, String> animalMap;

  //  
  public reptile() {
      super();
  }
  //
  public reptile(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name, specie, birthDateStr);
      type = "reptile";
  }

    //
  public void printAnimal(){
      super.printAnimal();
      System.out.printf("Type: %s%n", type);
  }

    //get animal map
  public Map getAnimalMap(){
    animalMap = super.getAnimalMap();
    animalMap.put("type",type);
    return animalMap;
  }
}