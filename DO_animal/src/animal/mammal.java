package animal;
import java.util.HashMap;
import java.util.Map;
import myUtil.InvalidAnimalException;
//import static java.io.FileDescriptor.in;
//import static java.lang.System.in;
//import java.time.LocalDate;
//import static javax.management.Query.in;

public class mammal extends animal {
  public static String type;
  public static float lifeExpectancy;
  public static Map<String, String> animalMap;

  //  overload constructor of parent class animal
  public mammal (){
      super();
  }
  public mammal(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name, specie, birthDateStr);
      type="mammal";
      lifeExpectancy = this.calculateLifeExpectancy();
  }
  
  //get animal map
  public Map getAnimalMap(){
    animalMap = super.getAnimalMap();
    animalMap.put("type",type);
    animalMap.put("lifeExpectancy",String.valueOf(lifeExpectancy));
    return animalMap;
  }
  
  //
  public void printAnimal(){
      super.printAnimal();
      System.out.printf("Type: %s%n", type);
      System.out.printf("Life expectancy: %s%n", lifeExpectancy);
  }
  /**
  *
  * @return lifeExpectancy
  */
  public static float calculateLifeExpectancy() {
      float gap = 15 - (float) age;
      if (gap>=0){
        return gap; 
      }else{
        return 0;
      }
  }

}