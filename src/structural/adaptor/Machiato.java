package structural.adaptor;

public class Machiato {
    private final int temperature;
    private final int nrSugars;
    private final String producer;

    public Machiato(int temperature, int nrSugars, String producer) {
        this.temperature = temperature;
        this.nrSugars = nrSugars;
        this.producer = producer;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getNrSugars() {
        return nrSugars;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "Machiato{" +
                "temperature=" + temperature +
                ", nrSugars=" + nrSugars +
                ", producer='" + producer + '\'' +
                '}';
    }
}
