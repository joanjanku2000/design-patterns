package creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * The Factory Method Design Pattern is a creational pattern that
 * provides an interface for creating objects but allows subclasses
 * to decide which class to instantiate.
 * It is a pattern that promotes loose coupling between classes and promotes code reuse.
 */
public class FactoryMethodUsage {
    public static void main(String[] args) {
        final String type = "PC";

        GameFactory gameFactory;
        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")){
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("unknown game type");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Created game " + createdGame);
    }
}