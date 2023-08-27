package structural.bridge;

public class Fanta implements Drink {
    @Override
    public String getVolume() {
        return "500ml";
    }

    @Override
    public boolean isAddictive() {
        return false;
    }

    @Override
    public int getNumberOfSugarLumps() {
        return 1000000;
    }

    @Override
    public Taste getTaste() {
        return Taste.SWEET;
    }

    public String toString(){
        return "Fanta [" + getVolume() + "," + getTaste() + "," + getNumberOfSugarLumps() + "]";
    }
}
