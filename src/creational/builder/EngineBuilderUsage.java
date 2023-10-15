package creational.builder;

public class EngineBuilderUsage {

    public static void main(String[] args) {
        Engine engine = new EngineBuilder()
                        .name("1.9TDI")
                        .hp(105)
                        .model("TDI")
                        .yearOfProduction(2008)
                        .build();
        System.out.println(engine);

    }
}
