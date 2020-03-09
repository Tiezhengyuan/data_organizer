package animal;

import myUtil.InvalidAnimalException;


public class pig extends mammal {

  //  overload constructor of parent class mammal
  public pig(){
      super();
  }

    /**
     *
     * @param name
     * @param specie
     * @param birthDateStr
     */
  public pig(String name, String specie, String birthDateStr) throws InvalidAnimalException {
    super(name, specie, birthDateStr);
  }
  
}