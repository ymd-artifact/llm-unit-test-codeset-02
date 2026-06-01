import java.util.function.IntUnaryOperator;

public class Class3B0006 {
    private int value;

    public Class3B0006(int value) {
        this.value = value;
    }

    // Pattern: lambda expression (multiple statements)
    public int func3B0006(int input) {
        IntUnaryOperator operation = x -> {
            int result = x + value;
            result *= 2;
            return result;
        };
        return operation.applyAsInt(input);
    }
}