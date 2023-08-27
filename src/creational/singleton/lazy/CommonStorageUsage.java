package creational.singleton.lazy;

public class CommonStorageUsage {
    public static void main(String[] args) {
        CommonStorage commonStorageA = CommonStorage.getInstance(); //CommonStorage.getInstance(); // the instance is CREATED at this time
        CommonStorage commonStorageB = CommonStorage.getInstance(); //CommonStorage.getInstance(); // second access to previously created instance
        System.out.println(commonStorageA == CommonStorage.getInstance()); // true

        commonStorageA.addValue(1); // values -> tek instanca commonStorageA -> behet me size 1
        commonStorageB.addValue(2); // values -> tek instacna commonStorageB
                                // (qe eshte e njejta me commonStorageA) -> behet me size 2
        System.out.println(commonStorageA.getValues().size()); // list size is 2



    }
}
