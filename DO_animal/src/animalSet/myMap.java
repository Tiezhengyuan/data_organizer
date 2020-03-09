package animalSet;

import java.util.*;


public class myMap {

  public static Map<String, String> hash;

    /**
     *constructor
     * @param newHash
     */
  public myMap(Map newHash) {
    hash = newHash;
  }

  //
  
  //
  public static void printMap() {
    System.out.printf("%20s%20s\n", "Key", "Value");
    System.out.println("--------------------------");
    for (Map.Entry me : hash.entrySet()) {
      System.out.printf("%20s%20s\n", me.getKey(), me.getValue());
    }
  }
  
}
//end