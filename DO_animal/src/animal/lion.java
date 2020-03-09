package animal;

//import animal.mammal;

import myUtil.InvalidAnimalException;


public class lion extends mammal {

  //  overload constructor of parent class mammal
  public lion (){
      super();
  }

    /**
     *
     * @param name
     * @param specie
     * @param birthDateStr
     */
  public lion(String name, String specie, String birthDateStr) throws InvalidAnimalException {
    super(name, specie, birthDateStr);
  }
 
}