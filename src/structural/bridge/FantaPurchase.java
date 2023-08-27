package structural.bridge;

public class FantaPurchase implements DrinkPurchase {
    @Override
    public Drink buy(Double cost) {
        System.out.println("Buying Fanta " + cost);
        return new Fanta();
    }
}
