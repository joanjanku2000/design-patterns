package creational.singleton.lazy;

public class CommonStorageUsage {
    public static void main(String[] args) {
        CommonStorage commonStorageA = CommonStorage.getInstance(); // the instance is CREATED at this time
        CommonStorage commonStorageB = CommonStorage.getInstance(); // second access to previously created instance
        System.out.println(commonStorageA == commonStorageB); // true

        commonStorageA.addValue(1);
        commonStorageB.addValue(2);
        System.out.println(commonStorageA.getValues().size()); // list size is 2
    }
}
