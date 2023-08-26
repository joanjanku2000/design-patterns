package structural.bridge;


public class CoffeePurchase implements DrinkPurchase {

    @Override
    public Drink buy(final Double cost) {
        System.out.println("Buying a a coffee for " +  cost);
        return new Coffee();
    }
}