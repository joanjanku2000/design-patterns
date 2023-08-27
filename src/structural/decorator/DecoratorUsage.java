package structural.decorator;

public class DecoratorUsage {
    public static void main(String[] args) {
        FragStatistics statistics = new FirstPersonShooterFragStatistics();

        statistics.incrementDeathCount();
        statistics.incrementFragCount();

        FragStatistics decoratedStatistics = new FragDeathRatioDecorator(new FragInfoDecorator(new DisplayCountersDecorator(new DeathCountInfoDecorator(statistics))));

        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementFragCount();
        decoratedStatistics.incrementDeathCount();
    }
}
