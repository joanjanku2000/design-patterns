package creational.factory.engine;

public class TMaxEngine implements Engine {
    private String name;
    private Integer year;
    private Integer hp;

    public TMaxEngine(String name, Integer year, Integer hp){
        this.name = name;
        this.year = year;
        this.hp = hp;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Integer getYear() {
        return null;
    }

    @Override
    public Integer getHp() {
        return null;
    }

    @Override
    public String toString() {
        return "TMaxEngine{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                '}';
    }
}
