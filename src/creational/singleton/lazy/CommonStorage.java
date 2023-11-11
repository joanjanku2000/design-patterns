package creational.singleton.lazy;

import java.util.ArrayList;
import java.util.List;

public class CommonStorage {
    private static CommonStorage instance = new CommonStorage();

    public static CommonStorage getInstance() {
//        if (instance == null) { // (1)
//            instance = new CommonStorage(); // (2)
//        }
        return instance;
    }

    private List<Integer> values = new ArrayList<>();

    private CommonStorage() {
    }

    public void addValue(final int value) {
        values.add(value);
    }

    public List<Integer> getValues() {
        return values;
    }
}


