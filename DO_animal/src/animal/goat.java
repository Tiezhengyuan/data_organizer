package animal;

//

import myUtil.InvalidAnimalException;

public class goat extends mammal {

  //  overload constructor of parent class mammal
  public goat (){
      super();
  }

    /**
     *
     * @param name
     * @param specie
     * @param birthDateStr
     */
  public goat(String name, String specie, String birthDateStr) throws InvalidAnimalException {
    super(name, specie, birthDateStr);
  }
 
}