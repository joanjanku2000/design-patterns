package creational.builder;

/**
 * Builder pattern aims to “Separate the construction of a complex object from
 * its representation so that the same construction process can create different
 * representations.” It is used to construct a complex object step by step and
 * the final step will return the object. The process of constructing an
 * object should be generic so that it can be used to create different
 * representations of the same object.
 */
public class ToyBuilderUsage {
    public static void main(String[] args) {
         ToyBuilder toyBuilder = new ToyBuilder()
                .madeOf("plastic")
                .name("Matchbox car")
                .type("Small car")
               ;
        Toy toy = toyBuilder.build();

        System.out.println("Toy = " + toy);

    }
}
