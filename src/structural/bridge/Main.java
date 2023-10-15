package structural.bridge;

/**
 * decouple an abstraction from
 * its implementation so that the two can vary independently
 */
public class Main {
    public static void main(String[] args) {
        Drink fanta = new Fanta();
        System.out.println(fanta);
        DrinkPurchase drinkPurchase = new FantaPurchase();
        drinkPurchase.buy(20.5);
    }
}
