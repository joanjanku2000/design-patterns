package behavioral.interpreter;

public class WordsWithoutOrderMathOperationsInterpreter implements Interpreter {
  private final MathOperationApplier mathOperationApplier;

  private static final String INCORRECT_SYNTAX = "Expression is incorrect";

  public WordsWithoutOrderMathOperationsInterpreter(final MathOperationApplier mathOperationApplier) {
    this.mathOperationApplier = mathOperationApplier;
  }

  @Override
  public String interpret(final String context) {
    final String[] splitData = context.trim().split(" ");

    if (splitData.length % 2 == 0) {
      return INCORRECT_SYNTAX;
    }

    Double value = Double.valueOf(splitData[0]);
    for (int idx = 1; idx < splitData.length - 1; idx += 2) {
      value = mathOperationApplier.apply(extractOperation(splitData[idx]), value, Double.valueOf(splitData[idx + 1]));
    }
    return value.toString();
  }

  private MathOperation extractOperation(final String operation) {
    return MathOperation.valueOf(operation);
  }
}