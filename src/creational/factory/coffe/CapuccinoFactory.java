package creational.factory.coffe;

import creational.builder.Coffee;

public class CapuccinoFactory implements CoffeFactory {
    @Override
    public Coffe create() {
        return new Capucino();
    }
}
