package creational.factory.coffe;


public class Machiatto implements Coffe {
    private String name;

    public Machiatto(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }
}
