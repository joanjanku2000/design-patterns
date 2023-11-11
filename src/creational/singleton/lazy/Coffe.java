package creational.singleton.lazy;

public class Coffe {
    private static final Coffe instance = new Coffe("tes", 1);
    private final String name;
    private final Integer nrOfSugars;

    private Coffe(String name, Integer nrOfSugars) {
        this.name = name;
        this.nrOfSugars = nrOfSugars;
    }


    public static Coffe getInstance() {
        return instance;
    }
    public String getName() {
        return name;
    }
    public Integer getNrOfSugars() {
        return nrOfSugars;
    }
    @Override
    public String toString() {
        return "Coffe{" +
                "name='" + name + '\'' +
                ", nrOfSugars=" + nrOfSugars +
                '}';
    }


}
