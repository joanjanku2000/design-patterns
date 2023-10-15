package creational.prototype.engine;

public class Engine {
    private String name;
    private Integer horsePower;
    private String manufacturer;

    public Engine(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine(String name, Integer horsePower, String manufacturer) {
        this.name = name;
        this.horsePower = horsePower;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    public Engine clone() {
        return new Engine(this.name, this.horsePower, this.manufacturer);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", horsePower=" + horsePower +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
