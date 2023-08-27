package structural.adaptor;

public class MachiatoAdapter implements Coffe {
    private final Machiato machiato;
    public MachiatoAdapter(Machiato machiato) {
        this.machiato = machiato;
    }
    @Override
    public boolean isCoffeCold() {
        return machiato.getTemperature() < 10;
    }
    @Override
    public String getProducer() {
        return machiato.getProducer();
    }
    @Override
    public int getNrOfSugars() {
        return machiato.getNrSugars();
    }
}
