package structural.composite.coffe;

public class Latte implements Coffe {
    @Override
    public void fill() {
        System.out.println("Filling lattte with latte");
    }

    @Override
    public void empty() {
        System.out.println("Drinking milk");
    }
}
