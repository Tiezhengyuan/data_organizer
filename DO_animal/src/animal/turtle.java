package animal;

import static animal.mammal.animalMap;
import static animal.mammal.type;
import java.util.HashMap;
import java.util.Map;
import myUtil.InvalidAnimalException;


public class turtle extends reptile {

  public static float lifeExpectancy;
  public static Map<String,String> animalMap;
  
  //contstructor 
  public turtle() {
      super();
  }
  public turtle(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name,specie,birthDateStr);
      lifeExpectancy = this.calculateLifeExpectancy();
  }
  
  //
  public void printAnimal(){
      super.printAnimal();
      System.out.printf("Life expectancy: %s%n", lifeExpectancy);
  }
  //
  public static float getLifeExpectancy() {
      return lifeExpectancy;
  }
  //
  public static float calculateLifeExpectancy() {
      return 110 - age;
  }

  //get animal map
  public Map getAnimalMap(){
    animalMap = super.getAnimalMap();
    animalMap.put("lifeExpectancy",String.valueOf(lifeExpectancy));
    return animalMap;
  }



}