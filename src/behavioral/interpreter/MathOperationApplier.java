package behavioral.interpreter;

public class MathOperationApplier {

    public Double apply(final MathOperation mathOperation, final Double first, final Double second) {
        switch (mathOperation) {
            case ADD:
                return first + second;
            case DIVIDE:
                return first / second;
            case MULTIPLY:
                return first * second;
            case SUBTRACT:
                return first - second;
            case EXPONENTIATION:
                return Math.pow(first, second);
        }
        throw new UnsupportedOperationException();
    }
}
