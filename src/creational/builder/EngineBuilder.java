package creational.builder;

public class EngineBuilder {
    private String name;
    private Integer hp;
    private String model;
    private Integer yearOfProduction;

    public EngineBuilder name(String name) {
        this.name = name;
        return this;
    }

    public EngineBuilder hp(Integer hp) {
        this.hp = hp;
        return this;
    }

    public EngineBuilder model(String model) {
        this.model = model;
        return this;
    }

    public EngineBuilder yearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        return this;
    }

    public Engine build() {
        return new Engine(name, hp, model, yearOfProduction);
    }
}
