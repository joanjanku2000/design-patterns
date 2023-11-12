package behavioral.iterator.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(5);
        integerList.add(7);

        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=====");
        for (Integer i : integerList) {
            System.out.println(i);
        }
        System.out.println("=====");
        for (int i = 0; i < integerList.size(); i++){
            System.out.println(integerList.get(i));
        }
        System.out.println("=====");
        integerList.forEach(el -> System.out.println(el));
    }
}
