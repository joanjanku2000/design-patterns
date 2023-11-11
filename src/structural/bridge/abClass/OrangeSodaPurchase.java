package structural.bridge.abClass;


public class OrangeSodaPurchase extends DrinkPurchase {
    @Override
    Drink buy(Double cost) {
        super.purchases.add(cost);
        return new OrangeSoda();
    }
}
