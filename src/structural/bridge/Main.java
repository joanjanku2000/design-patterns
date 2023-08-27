package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Drink fanta = new Fanta();
        System.out.println(fanta);
        DrinkPurchase drinkPurchase = new FantaPurchase();
        drinkPurchase.buy(20.5);
    }
}
