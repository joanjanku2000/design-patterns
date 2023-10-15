package structural.composite.coffe;

public class Machiato implements Coffe {
    @Override
    public void fill() {
        System.out.println("Filling Machiato");
    }

    @Override
    public void empty() {
        System.out.println("Drinking machiato");
    }
}
