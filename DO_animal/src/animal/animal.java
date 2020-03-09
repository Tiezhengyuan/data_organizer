package animal;

//import IllegalArgumentException;
//import IndexOutOfBoundsException;
import myUtil.InvalidAnimalException;
import java.time.LocalDate;
import java.util.*;

//public class animal extends IllegalArgumentException, IndexOutOfBoundsException, IllegalArgumentException, IllegalArgumentException, IllegalArgumentException, IndexOutOfBoundsException {
public class animal{

  static String name;
  public static String birthDateStr;
  public static LocalDate birthDate;
  public static int age;
  public static float lifeExpectancy;
  public static String specie;
  public static Map <String, String> animalMap;
    
 
  //
  //private static String[] animalTypes = new String[] {"mammal", "reptile", "bird"};
  //private static String[] animalSpecies;
  
    /**
     *constructor
     */
  animal (){
      
  }
  @SuppressWarnings("empty-statement")
  animal(String newName, String newSpecie, String newBirthDateStr) throws InvalidAnimalException{
      this.setAnimalName(newName); //validate animal name
      birthDateStr = newBirthDateStr;
      birthDate = LocalDate.parse(birthDateStr);
      specie = newSpecie;
      age = this.calculateAge();
      //
    }

  //set animal name;
  public void setAnimalName(String newName)  throws InvalidAnimalException{
      //System.out.println("d!".matches("(.*)[!](.*)"));
      if(newName.matches("(.*)[!@#$%^&*()\\[\\]{}](.*)")){
          throw new InvalidAnimalException(newName);
      }else {
          name = newName;
      }
      
  }

    /**
     *print animal information
     */
  public void printAnimal(){
      System.out.println("Animal Data");
      System.out.printf("Name: %s%n", name);
      System.out.printf("specie: %s%n", specie);
      System.out.printf("Birth date: %s%n", birthDate);
      System.out.printf("Age: %s%n", age);
      
  }
  
  //
  public static String getName(){
      return name;
  }
  public static LocalDate getBirthDate(){
      return birthDate;
  }
  public static int getAge(){
      return age;
  }
/*  public static float getLifeExpectancy() {
      return lifeExpectancy;
  }*/

 
  //
  public Map getAnimalMap(){
      animalMap = new HashMap();
      animalMap.put("name",name);
      animalMap.put("specie",specie);
      animalMap.put("birthDate",birthDate.toString());
      animalMap.put("age",String.valueOf(age));
      return animalMap;
  }
  
  //
  public static int calculateAge() {
    int gap, year, currentYear;
    //animal year
    year = birthDate.getYear();
    //current year
    LocalDate currentDate = LocalDate.now();
    currentYear = currentDate.getYear();
    //gap = myDate.GetYearGap(birthDate);
    gap = currentYear - year;
    if (gap >= 0){
        age=gap;
        //System.out.printf("Age of the animal is %d years old.", gap);
        return gap;
    }else{
        System.out.printf("Birth Date is incorrect.");
        return -1;
    }
  }

  //
  public static float calculateLifeExpectancy(){
      return 0;
  }

  


}