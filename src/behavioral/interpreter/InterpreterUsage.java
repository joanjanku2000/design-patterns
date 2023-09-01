package behavioral.interpreter;

public class InterpreterUsage {
  public static void main(String[] args) {
    final MathOperationApplier mathOperationApplier = new MathOperationApplier();
    Interpreter interpreter = new PythonStyleWithoutOrderMathOperationsInterpreter(mathOperationApplier);

    String result = interpreter.interpret(args[0]);
    System.out.println(result);

    interpreter = new WordsWithoutOrderMathOperationsInterpreter(mathOperationApplier);
    result = interpreter.interpret(args[1]);
    System.out.println(result);
  }
}