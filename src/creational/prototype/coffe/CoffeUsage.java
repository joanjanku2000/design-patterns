package creational.prototype.coffe;

public class CoffeUsage {
    public static void main(String[] args) {
        CoffeStore coffeStore = new CoffeStore("Mulliri");
        Coffe coffe = coffeStore.getCoffe("Espresso",2,"Name test");
        System.out.println(coffe);

    }
}
