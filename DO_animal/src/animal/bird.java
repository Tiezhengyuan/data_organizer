package animal;

import static animal.animal.name;
import static animal.mammal.animalMap;
import static animal.mammal.lifeExpectancy;
import java.util.HashMap;
import java.util.Map;
import myUtil.InvalidAnimalException;


public class bird extends animal {
  public static String type;
  public static float lifeExpectancy;
  public static Map<String,String> animalMap;
    
  
  //constructor
  public bird(){
      super();
  }
  public bird(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name,specie,birthDateStr);
      type = "bird";
      lifeExpectancy = this.calculateLifeExpectancy();
  }

  //
  public void printAnimal(){
      super.printAnimal();
      System.out.printf("Type: %s%n", type);
      System.out.printf("Life expectancy: %s%n", lifeExpectancy);
  }
  
  public static float calculateLifeExpectancy() {
      return 5;
  }

    //get animal map
  public Map getAnimalMap(){
    animalMap = super.getAnimalMap();
    animalMap.put("type",type);
    animalMap.put("lifeExpectancy",String.valueOf(lifeExpectancy));
    return animalMap;
  }
}