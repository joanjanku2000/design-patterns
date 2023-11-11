package structural.bridge.abClass;

import structural.bridge.Taste;

public interface Drink {
    String getVolume();
    boolean isAddictive();
    int getNumberOfSugarLumps();
    Taste getTaste();
}
