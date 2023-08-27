package creational.factory.coffe;

public class MachiattoFactory implements CoffeFactory{
    @Override
    public Coffe create() {
        return new Machiatto("Machiatto Latte");
    }
}
