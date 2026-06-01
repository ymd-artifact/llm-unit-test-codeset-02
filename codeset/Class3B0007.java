import java.util.function.IntBinaryOperator;

public class Class3B0007 {
    private int value;

    public Class3B0007(int value) {
        this.value = value;
    }

    // Pattern: method reference
    public int func3B0007(int input) {
        IntBinaryOperator operation = this::multiply;
        return operation.applyAsInt(input, value);
    }

    private int multiply(int x, int y) {
        return x * y;
    }
}