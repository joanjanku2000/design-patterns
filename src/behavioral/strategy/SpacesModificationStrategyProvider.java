package behavioral.strategy;

public class SpacesModificationStrategyProvider {

  public SpacesModificationStrategy get(final StrategyType strategyType) {
    switch (strategyType) {
      case DOUBLE:
        return new DoubleSpacesStrategy();
      case REMOVE:
        return new RemoveSpacesStrategy();
      case REPLACE:
        return new ReplaceWithUnderscoreStrategy();
    }
    throw new UnsupportedOperationException("Unsupported strategy type");
  }
}