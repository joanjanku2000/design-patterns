package structural.composite.coffe;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coffe> coffes = new ArrayList<>();
        coffes.add(new Machiato());
        coffes.add(new Espresso());
        coffes.add(new Latte());

        for (Coffe c : coffes){
            c.fill();
        }
    }
}
