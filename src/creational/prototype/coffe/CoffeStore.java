package creational.prototype.coffe;

public class CoffeStore {
    private final Coffe BASE_COFFE ; // prototipi

    public CoffeStore(String producer){
        BASE_COFFE = new Coffe(producer);
    }

    public Coffe getCoffe(String type, int sugars,String name) {
        Coffe coffe = BASE_COFFE.createClone();
        coffe.setType(type);
        coffe.setSugars(sugars);
        coffe.setName(name);
        return coffe;
    }
}
