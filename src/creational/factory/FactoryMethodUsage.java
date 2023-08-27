package creational.factory;

import java.util.ArrayList;
import java.util.List;

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