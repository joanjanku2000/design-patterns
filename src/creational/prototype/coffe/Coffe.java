package creational.prototype.coffe;

public class Coffe {
    private String type;
    private String name;
    private String producer;
    private int sugars;
    public Coffe() {
    }
    public Coffe(String producer) {
        this.producer = producer;
    }
    public Coffe(String name, String producer, int sugars) {
        this.name = name;
        this.producer = producer;
        this.sugars = sugars;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getSugars() {
        return sugars;
    }

    public void setSugars(int sugars) {
        this.sugars = sugars;
    }

    public Coffe createClone() {
        Coffe coffe = new Coffe();
        coffe.setName(this.name);
        coffe.setProducer(this.producer);
        coffe.setSugars(this.sugars);
        coffe.setType(this.type);
        return coffe;
    }

    @Override
    public String toString() {
        return "Coffe{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", producer='" + producer + '\'' +
                ", sugars=" + sugars +
                '}';
    }
}
