package creational.builder;

public class Toy {
    private String name;
    private String type;
    private String madeOf;

    Toy(String name,String type, String madeOf) {
        this.name = name;
        this.type = type;
        this.madeOf = madeOf;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getMadeOf() {
        return madeOf;
    }

    public void setMadeOf(final String madeOf) {
        this.madeOf = madeOf;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", madeOf='" + madeOf + '\'' +
                '}';
    }
}
