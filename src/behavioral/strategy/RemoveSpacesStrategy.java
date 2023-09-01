package behavioral.strategy;

public class RemoveSpacesStrategy implements SpacesModificationStrategy {
  @Override
  public String modify(final String input) {
    final StringBuilder stringBuilder = new StringBuilder(input.length());
    for (final char c : input.toCharArray()) {
      if (c != ' ') {
        stringBuilder.append(c);
      }
    }
    return stringBuilder.toString();
  }
}