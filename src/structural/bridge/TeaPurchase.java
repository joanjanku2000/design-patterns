package structural.bridge;


public class TeaPurchase implements DrinkPurchase {
    @Override
    public Drink buy(final Double cost) {
        System.out.println("Buying a a tea for " + cost);
        return new Tea();
    }
}
