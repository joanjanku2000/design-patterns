package creational.singleton.eager;

public class SimpleCounterEnumUsage {
    public static void main(String[] args) {
        SimpleCounterEnum simpleCounterA = SimpleCounterEnum.INSTANCE;
        SimpleCounterEnum simpleCounterB = SimpleCounterEnum.INSTANCE;
        System.out.println(simpleCounterA == simpleCounterB); // also true

        simpleCounterA.increment();
        simpleCounterB.increment();
        System.out.println(simpleCounterA.getCurrentCount()); // 2
    }
}
