package animal;

import myUtil.InvalidAnimalException;


public class eagle extends bird {
  //constructor
  public eagle() {
      super();
  }
    
  public eagle(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name, specie, birthDateStr);
  }


}