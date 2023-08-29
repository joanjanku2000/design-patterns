package creational.factory.coffe;

public abstract class Coffe {
     abstract String getName();

     public String toString(){
          return "Coffe [ " + getName() + "]";
     }

}
