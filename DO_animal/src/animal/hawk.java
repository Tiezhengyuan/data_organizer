package animal;

import myUtil.InvalidAnimalException;


public class hawk extends bird {
  //constructor
  public hawk() {
      super();
  }
    
  public hawk(String name, String specie, String birthDateStr) throws InvalidAnimalException {
      super(name, specie, birthDateStr);
  }


}