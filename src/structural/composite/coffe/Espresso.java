package structural.composite.coffe;


public class Espresso implements Coffe {
    @Override
    public void fill() {
        System.out.println("Filling with espresso");
    }

    @Override
    public void empty() {
        System.out.println("Drinking espresso");
    }
}
