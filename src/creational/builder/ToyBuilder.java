package creational.builder;

public class ToyBuilder {
    private String name;
    private String type;
    private String madeOf;

    public ToyBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ToyBuilder type(final String type) {
        this.type = type;
        return this;
    }

    public ToyBuilder madeOf(final String madeOf) {
        this.madeOf = madeOf;
        return this;
    }

    public Toy build() {
        return new Toy(name, type, madeOf);
    }
}