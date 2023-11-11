package structural.bridge.abClass;

public class OrangeSodaUsage {

    public static void main(String[] args) {
        DrinkPurchase orangeSodaPurchases = new OrangeSodaPurchase();
        System.out.println(orangeSodaPurchases.buy(50.0).getTaste());
        orangeSodaPurchases.buy(100.0);

        System.out.println(orangeSodaPurchases.getPurchases());
    }
}
