package behavioral.strategy;

public class StrategyUsage {
    public static void main(String[] args) {
        StrategyType strategyType = StrategyType.valueOf(args[0]);
        String input = "hello from SDA knowledge base!";

        SpacesModificationStrategyProvider provider = new SpacesModificationStrategyProvider();
        SpacesModificationStrategy strategy = provider.get(strategyType);
        final String output = strategy.modify(input);
        System.out.println("Result is " + output);
    }
}