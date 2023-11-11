package structural.bridge.abClass;

import structural.bridge.Taste;

public class OrangeSoda implements Drink{
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
        return 5;
    }

    @Override
    public Taste getTaste() {
        return Taste.SWEET;
    }
}
