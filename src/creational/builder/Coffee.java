package creational.builder;

public class Coffee {
    private String type;
    private int sugars;
    private boolean milk;
    public Coffee(String type, int sugars, boolean milk) {
        this.type = type;
        this.sugars = sugars;
        this.milk = milk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public int getSugars() {
        return sugars;
    }
    public void setSugars(int sugars) {
        this.sugars = sugars;
    }
    public boolean isMilk() {
        return milk;
    }
    public void setMilk(boolean milk) {
        this.milk = milk;
    }
    public static CoffeBuilder getBuilder(){
        return new CoffeBuilder();
    }
    public static class CoffeBuilder {
        private String type;
        private int sugars;
        private boolean milk;


        public CoffeBuilder type(String type){
            this.type = type;
            return this;
        }

        public CoffeBuilder sugars(int sugars){
            this.sugars = sugars;
            return this;
        }
        public CoffeBuilder milk(boolean milk){
            this.milk = milk;
            return this;
        }

        public Coffee build(){
            return new Coffee(type,sugars,milk);
        }

        public Coffee create(){
            return new Coffee(type,sugars,milk);
        }
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", sugars=" + sugars +
                ", milk=" + milk +
                '}';
    }

    public static void main(String[] args) {
        Coffee coffee = Coffee.getBuilder()
                .type("Machiatto")
                .sugars(2)
                .milk(true)
                .build();

        System.out.println(coffee);
    }

}
