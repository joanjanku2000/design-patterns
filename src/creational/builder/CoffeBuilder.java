package creational.builder;

public class CoffeBuilder {
    private String type;
    private int sugars;
    private boolean milk;

    public String getType() {
        return type;
    }

    public CoffeBuilder type(String type) {
        this.type = type;
        return this;
    }

    public int getSugars() {
        return sugars;
    }

    public CoffeBuilder sugars(int sugars) {
        this.sugars = sugars;
        return this;
    }

    public boolean isMilk() {
        return milk;
    }

    public CoffeBuilder milk(boolean milk) {
        this.milk = milk;
        return this;
    }

    public Coffee build(){
        return new Coffee(this.type,this.sugars,this.milk);
    }

    @Override
    public String toString() {
        return "CoffeBuilder{" +
                "type='" + type + '\'' +
                ", sugars=" + sugars +
                ", milk=" + milk +
                '}';
    }
}
