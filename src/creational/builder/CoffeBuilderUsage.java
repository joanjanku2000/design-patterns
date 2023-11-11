package creational.builder;

public class CoffeBuilderUsage {

    public static void main(String[] args) {
        Coffee coffee =
                new CoffeBuilder()
                .milk(true)
                .type("machiato")
                .sugars(4)
                .build();
        //Coffee anotherCoffe = coffee.clone();

        System.out.println(coffee);
    }
}
