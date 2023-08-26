package creational.singleton.eager;

public class SimpleCounter {

    // static field in which we keep the singleton reference
    // it is an eager singleton so we create an instance by assigning it to the field
    private static final SimpleCounter INSTANCE = new SimpleCounter();

    // getter for singleton reference
    public static SimpleCounter getInstance() {
        return INSTANCE;
    }

    // hidden constructor
    private SimpleCounter() {}

    private int currentCount = 0;

    public int getCurrentCount() {
        return currentCount;
    }

    public void increment() {
        currentCount++;
    }
}
