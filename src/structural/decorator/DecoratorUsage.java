package structural.decorator;

public class DecoratorUsage {
    public static void main(String[] args) {
        FragStatistics statistics = new FirstPersonShooterFragStatistics();

        statistics.incrementDeathCount(); // nothing appears on the screen
        statistics.incrementFragCount(); // nothing appears on the screen

        // use of decorators
        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(new FragInfoDecorator(new DisplayCountersDecorator(new DeathCountInfoDecorator(statistics))));

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount(); // because we are good players!
        decoratedStatistics.incrementDeathCount();
    }
}
